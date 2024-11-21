
package Model;

public class SesionDatosVuelo {
  private static int idVuelo;
    private static String origen;
    private static String destino;
    private static String fechaIda;
    private static String fechaVuelta;
    private static int asientosDisponibles;

    // Métodos para guardar los datos
    public static void setDatosVuelo(int idVuelo, String origen, String destino, String fechaIda, String fechaVuelta, int numPersonas, int horaSalida) {
        SesionDatosVuelo.idVuelo = idVuelo;
        SesionDatosVuelo.origen = origen;
        SesionDatosVuelo.destino = destino;
        SesionDatosVuelo.fechaIda = fechaIda;
        SesionDatosVuelo.fechaVuelta = fechaVuelta;
        SesionDatosVuelo.asientosDisponibles = numPersonas;
       
    }

    public static int getIdVuelo() {
        return idVuelo;
    }

    public static String getOrigen() {
        return origen;
    }

    public static String getDestino() {
        return destino;
    }

    public static String getFechaIda() {
        return fechaIda;
    }

    public static String getFechaVuelta() {
        return fechaVuelta;
    }

   
    public static int getAsientosDisponibles() {
        return asientosDisponibles;
    }

    static void setDatosVuelo(int numeroPersonas, String origen, String destino, String fechaIda, String fechaVuelta, int idVueloSeleccionado, String horaSalida, String horaLlegada) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

 

    

    
}
