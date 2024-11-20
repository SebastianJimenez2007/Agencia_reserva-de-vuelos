
package Model;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Date;

public class AdminDAO {
    private final Connection connection;

    // Constructor de AdminDAO que recibe la conexión
    public AdminDAO(Connection connection) {
        this.connection = connection;
    }

    // Método para agregar un vuelo
    public boolean agregarVuelo(String origen, String destino, Date fechaSalida, Date fechaRegreso, int asientos, String horaSalida, String horaLlegada) {
        String sql = "INSERT INTO vuelosdisponibles (origen, destino, fecha_salida, fecha_vuelta, asientos_disponibles, hora_salida, hora_llegada) VALUES (?, ?, ?, ?, ?, ?, ?)";
        
        try (PreparedStatement statement = connection.prepareStatement(sql)) {
            // Establecer los valores para la consulta
            statement.setString(1, origen);
            statement.setString(2, destino);
            statement.setDate(3, fechaSalida);
            statement.setDate(4, fechaRegreso);
            statement.setInt(5, asientos);
            statement.setString(6, horaSalida);  // hora salida como String
            statement.setString(7, horaLlegada); // hora llegada como String

            // Ejecutar la inserción
            int rowsInserted = statement.executeUpdate();
            return rowsInserted > 0; // Retorna true si se insertó correctamente

        } catch (SQLException e) {
            System.out.println("Error al agregar el vuelo: " + e.getMessage());
            return false; // Retorna false si ocurrió un error
        }
    }
}

    
    
  

    

