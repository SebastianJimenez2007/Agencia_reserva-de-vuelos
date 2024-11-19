package Model;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.DriverManager;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

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
        String sql = "SELECT rol FROM usuarios WHERE nombre = ? AND contraseña = ?";
        try (Connection conn = this.connect(); PreparedStatement pstmt = conn.prepareStatement(sql)) {
            pstmt.setString(1, nombre);
            pstmt.setString(2, contraseña);
            ResultSet rs = pstmt.executeQuery();

            if (rs.next()) {
                return rs.getString("rol"); // Devuelve el rol si el usuario y la contraseña coinciden
            }

        } catch (SQLException e) {
            System.out.println("Error al autenticar usuario: " + e.getMessage());
        }
        return null; 
    }
    
    

    public boolean authenticateUser(String nombre, String contraseña) {
        String sql = "SELECT * FROM usuarios WHERE nombre = ? AND contraseña = ?";
        try (Connection conn = this.connect(); PreparedStatement pstmt = conn.prepareStatement(sql)) {

            pstmt.setString(1, nombre);
            pstmt.setString(2, contraseña);
            ResultSet rs = pstmt.executeQuery();

            return rs.next();

        } catch (SQLException e) {
            System.out.println("Error al autenticar usuario: " + e.getMessage()); 
            return false;
        }
    }

    public List<Usuario> obtenerUsuarios() {
        List<Usuario> usuarioList = new ArrayList<>();
        String sql = "SELECT identificacion, nombre, apellido, correo, telefono FROM usuarios";

        try (Connection con = ConexionDB.conectar(); PreparedStatement pstmt = con.prepareStatement(sql); ResultSet rs = pstmt.executeQuery()) {

            while (rs.next()) {
                String identificacion = rs.getString("identificacion");
                String nombre = rs.getString("nombre");
                String apellido = rs.getString("apellido");
                String correo = rs.getString("correo");
                String telefono = rs.getString("telefono");

                Usuario usuario = new Usuario(identificacion, nombre, apellido, correo, telefono);
                usuarioList.add(usuario);
            }

        } catch (SQLException e) {
            System.err.println("Error al obtener usuario: " + e.getMessage());
        }

        return usuarioList;
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
    
    

}
