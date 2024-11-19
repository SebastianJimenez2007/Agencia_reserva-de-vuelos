
package Model;

public class Sesion {
   private static int idUsuario; // Variable estática para almacenar el ID del usuario logueado
    private static String nombreUsuario; // Variable estática para almacenar el nombre del usuario  

    public static void setIdUsuario(int id) {
        idUsuario = id;
    }

    // Método para obtener el ID del usuario logueado
    public static int getIdUsuario() {
        return idUsuario;
    }

    // Método para establecer el nombre del usuario logueado
    public static void setNombreUsuario(String nombre) {
        nombreUsuario = nombre;
    }

    // Método para obtener el nombre del usuario logueado
    public static String getNombreUsuario() {
        return nombreUsuario;
    }
    
}
