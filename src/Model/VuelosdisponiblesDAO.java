/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;


public class VuelosdisponiblesDAO {
    
  public List<Vuelosdisponibles> buscarVuelos(String origen, String destino, String fechaIda, String fechaVuelta, int numPersonas) {
        List<Vuelosdisponibles> listaVuelos = new ArrayList<>();
        
        String sql = "SELECT * FROM vuelosdisponibles WHERE origen = ? AND destino = ? AND fecha_salida = ? AND asientos_disponibles >= ?";
        
        try (Connection con = ConexionDB.conectar();
             PreparedStatement pst = con.prepareStatement(sql)) {
            
            pst.setString(1, origen);
            pst.setString(2, destino);
            pst.setString(3, fechaIda);
            pst.setInt(4, numPersonas);
            
            ResultSet rs = pst.executeQuery();
            
            while (rs.next()) {
                Vuelosdisponibles vuelo = new Vuelosdisponibles();
                vuelo.setId(rs.getInt("id"));
                vuelo.setOrigen(rs.getString("origen"));
                vuelo.setDestino(rs.getString("destino"));
                vuelo.setFechaSalida(rs.getString("fecha_salida"));
                vuelo.setFechaVuelta(rs.getString("fecha_vuelta"));
                vuelo.setAsientosDisponibles(rs.getInt("asientos_disponibles"));
                listaVuelos.add(vuelo);
            }
            
        } catch (SQLException e) {
            System.err.println("Error al consultar vuelos: " + e.getMessage());
        }
        
        return listaVuelos;
    }
  
  
  
  public Vuelosdisponibles buscarFechaCercana(String origen, String destino, String fechaIda) {
    Vuelosdisponibles vuelo = null;
    
    // sql para buscar las fechas anteriores y posteriores
    String sql = "SELECT *, ABS(DATEDIFF(fecha_salida, ?)) AS diferencia " +
                 "FROM vuelosdisponibles " +
                 "WHERE origen = ? AND destino = ? " +
                 "ORDER BY diferencia ASC LIMIT 1";
    
    try (Connection con = ConexionDB.conectar();
         PreparedStatement pst = con.prepareStatement(sql)) {
        
        pst.setString(1, fechaIda); 
        pst.setString(2, origen);
        pst.setString(3, destino);
        
        ResultSet rs = pst.executeQuery();
        
        if (rs.next()) {
            vuelo = new Vuelosdisponibles();
            vuelo.setId(rs.getInt("id"));
            vuelo.setOrigen(rs.getString("origen"));
            vuelo.setDestino(rs.getString("destino"));
            vuelo.setFechaSalida(rs.getString("fecha_salida"));
            vuelo.setFechaVuelta(rs.getString("fecha_vuelta"));
            vuelo.setAsientosDisponibles(rs.getInt("asientos_disponibles"));
        }
        
    } catch (SQLException e) {
        System.err.println("Error SQL " + e.getMessage());
    }
    
    return vuelo;
}


  
  public boolean actualizarAsientosDisponibles(int Id, int asientosDisponibles) {
    String sql = "UPDATE vuelosdisponibles SET asientos_disponibles = asientos_disponibles - ? WHERE id = ? AND asientos_disponibles >= ?";
    boolean actualizado = false;

    // Validación para asegurarse de que la cantidad de asientos sea positiva y válida
    if (asientosDisponibles <= 0) {
        System.out.println("La cantidad de asientos debe ser mayor que cero.");
        return false;
    }

    try (Connection conn = ConexionDB.conectar(); 
         PreparedStatement pstmt = conn.prepareStatement(sql)) {

        // Establecer los parámetros de la consulta
        pstmt.setInt(1, asientosDisponibles);  // La cantidad de asientos a disminuir
        pstmt.setInt(2, Id);            // ID del vuelo
        pstmt.setInt(3, asientosDisponibles);  // Asegura que haya suficientes asientos disponibles

        // Ejecuta la actualización
        int filasActualizadas = pstmt.executeUpdate();

        if (filasActualizadas > 0) {
            // Si filasActualizadas es mayor a 0, significa que la actualización fue exitosa
            System.out.println("Asientos actualizados correctamente.");
            actualizado = true;
        } else {
            // Si no se pudo actualizar (no hay suficientes asientos), se muestra un mensaje
            System.out.println("No hay suficientes asientos disponibles.");
        }

    } catch (SQLException e) {
        // Manejo de excepciones, muestra el error en consola
        System.err.println("Error al actualizar asientos disponibles: " + e.getMessage());
    }

    return actualizado;
}
  public void seleccionarVuelo(int idVueloSeleccionado, String origen, String destino, String fechaIda, String fechaVuelta, int numeroPersonas) {
    // Establecemos la conexión a la base de datos utilizando la clase ConexionDB
    try (Connection connection = ConexionDB.conectar()) {
        // Consulta SQL para obtener la hora de salida y llegada
        String query = "SELECT hora_salida, hora_llegada FROM vuelosdisponibles WHERE id = ?";
        
        try (PreparedStatement ps = connection.prepareStatement(query)) {
            // Establecemos el parámetro con el id del vuelo seleccionado
            ps.setInt(1, idVueloSeleccionado);
            ResultSet rs = ps.executeQuery();
            
            // Si encontramos un resultado, obtenemos las horas
            if (rs.next()) {
                String horaSalida = rs.getString("hora_salida");
                String horaLlegada = rs.getString("hora_llegada");
                
                // Verificamos si las horas son nulas y las asignamos si no lo son
                if (horaSalida != null && horaLlegada != null) {
                    // Ahora pasamos estos datos a la clase SesionDatosVuelo
                    SesionDatosVuelo.setDatosVuelo(numeroPersonas, origen, destino, fechaIda, fechaVuelta, idVueloSeleccionado, horaSalida, horaLlegada);
                } else {
                    System.out.println("Las horas de salida o llegada son nulas.");
                }
            } else {
                System.out.println("No se encontró el vuelo con ID: " + idVueloSeleccionado);
            }
        } catch (SQLException e) {
            System.err.println("Error al ejecutar la consulta: " + e.getMessage());
        }
    } catch (SQLException e) {
        System.err.println("Error de conexión a la base de datos: " + e.getMessage());
    }
}
  
 
    
}
