/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

import static Model.ConexionDB.conectar;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.DriverManager;
import java.time.LocalDate;
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
        System.err.println("Error al buscar fecha cercana: " + e.getMessage());
    }
    
    return vuelo;
}

  
  public boolean actualizarAsientosDisponibles(int vueloId, int cantidadAsientos) {
    String sql = "UPDATE vuelosdisponibles SET asientos_disponibles = asientos_disponibles - ? WHERE id = ? AND asientos_disponibles >= ?";
    boolean actualizado = false;

    try (Connection conn = conectar(); PreparedStatement pstmt = conn.prepareStatement(sql)) {
        pstmt.setInt(1, cantidadAsientos);
        pstmt.setInt(2, vueloId);
        pstmt.setInt(3, cantidadAsientos);

        int filasActualizadas = pstmt.executeUpdate();

        if (filasActualizadas > 0) {
            System.out.println("Asientos actualizados correctamente.");
            actualizado = true;
        } else {
            System.out.println("No hay suficientes asientos disponibles.");
        }

    } catch (SQLException e) {
        System.err.println("Error al actualizar asientos disponibles: " + e.getMessage());
    }

    return actualizado;
}
    
}
