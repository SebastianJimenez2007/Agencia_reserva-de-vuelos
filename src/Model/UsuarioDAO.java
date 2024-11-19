package Model;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.DriverManager;


public class UsuarioDAO {

    private Connection connect() {
        Connection con = null;
        try {
            String url = "jdbc:mysql://localhost:3306/basededatosagencia";
            String nombre = "root";
            String contraseña = "";
            con = DriverManager.getConnection(url, nombre, contraseña);
        } catch (SQLException e) {
            System.out.println("Error en la conexion: " + e.getMessage());
        }
        return con;
    }
    
    public String authenticateUserAndGetRole(String nombre, String contraseña) {
    String sql = "SELECT id_usuario, rol FROM usuarios WHERE nombre = ? AND contraseña = ?";
    try (Connection conn = this.connect(); PreparedStatement pstmt = conn.prepareStatement(sql)) {
        pstmt.setString(1, nombre);
        pstmt.setString(2, contraseña);
        ResultSet rs = pstmt.executeQuery();

        if (rs.next()) {
            // Obtener el id_usuario y el rol
            int idUsuario = rs.getInt("id_usuario");
            String rol = rs.getString("rol");

            // Guardar el id_usuario en la sesión
            Sesion.setIdUsuario(idUsuario);

            // Retornar el rol del usuario
            return rol;
        }

    } catch (SQLException e) {
        System.out.println("Error al autenticar usuario: " + e.getMessage());
    }
    return null; // Si no se encuentra el usuario, retornar null
}
    
   

    

    public boolean registrarUsuario(String nombre, String contraseña, String correo, String telefono, String identificacion, String rol) {
    String sql = "INSERT INTO usuarios (nombre, contraseña, correo, telefono, identificacion, rol) VALUES (?, ?, ?, ?, ?, ?)";
    
    try (Connection conn = this.connect(); PreparedStatement pstmt = conn.prepareStatement(sql)) {
        pstmt.setString(1, nombre);
        pstmt.setString(2, contraseña);
        pstmt.setString(3, correo);
        pstmt.setString(4, telefono);
        pstmt.setString(5, identificacion);
        pstmt.setString(6, rol);
        
        int filasInsertadas = pstmt.executeUpdate();
        
        return filasInsertadas > 0; // Retorna true si se insertó el usuario correctamente
    } catch (SQLException e) {
        System.err.println("Error al registrar el usuario: " + e.getMessage());
        return false;
    }
}
    public Usuario obtenerUsuarioPorId(int idUsuario) {
    String sql = "SELECT id_usuario, nombre, correo, telefono, identificacion, rol FROM usuarios WHERE id_usuario = ?";
    Usuario usuario = null;
    
    try (Connection conn = this.connect(); PreparedStatement pstmt = conn.prepareStatement(sql)) {
        pstmt.setInt(1, idUsuario);  // Establecer el ID del usuario en la consulta
        ResultSet rs = pstmt.executeQuery();

        if (rs.next()) {
            // Crear el objeto Usuario con los datos obtenidos de la base de datos
            usuario = new Usuario(
                rs.getInt("id_usuario"),
                rs.getString("nombre"),
                rs.getString("correo"),
                rs.getString("telefono"),
                rs.getString("identificacion"),
                rs.getString("rol")
            );
        }
    } catch (SQLException e) {
        System.err.println("Error al obtener el usuario por ID: " + e.getMessage());
    }
    return usuario;  // Retornar el objeto Usuario o null si no se encuentra
}
    
   

   
    

}
