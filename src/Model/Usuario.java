/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

//atributos
public class Usuario {
   private int idUsuario;
    private String nombre;
    private String apellido;  // Nuevo campo
    private String correo;
    private String telefono;
    private String identificacion;
    private String rol;

    // Constructor modificado
    public Usuario(int idUsuario, String nombre, String apellido, String correo, String telefono, String identificacion) {
        this.idUsuario = idUsuario;
        this.nombre = nombre;
        this.apellido = apellido;  // Asignar el valor del apellido
        this.correo = correo;
        this.telefono = telefono;
        this.identificacion = identificacion;
        this.rol = rol;
    }

    // Getters y setters (si es necesario)
    public int getIdUsuario() {
        return idUsuario;
    }

    public void setIdUsuario(int idUsuario) {
        this.idUsuario = idUsuario;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getIdentificacion() {
        return identificacion;
    }

    public void setIdentificacion(String identificacion) {
        this.identificacion = identificacion;
    }

    public String getRol() {
        return rol;
    }

    public void setRol(String rol) {
        this.rol = rol;
    }
}