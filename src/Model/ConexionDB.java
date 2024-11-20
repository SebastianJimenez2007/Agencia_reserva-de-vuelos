/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;


public class ConexionDB {

   private static final String URL = "jdbc:mysql://localhost:3306/basededatosagencia"; // Cambia con la URL de tu base de datos
    private static final String USER = "root"; // Cambia con tu usuario
    private static final String PASSWORD = ""; // Cambia con tu contraseña

    public static Connection conectar() throws SQLException {
        try {
            // Intentamos establecer la conexión
            Connection connection = DriverManager.getConnection(URL, USER, PASSWORD);
            System.out.println("Conexión exitosa");
            return connection;
        } catch (SQLException e) {
            System.out.println("Error al conectar a la base de datos: " + e.getMessage());
            throw e; // Lanza el error para que lo manejes en otro lado si es necesario
        }
    }
}
