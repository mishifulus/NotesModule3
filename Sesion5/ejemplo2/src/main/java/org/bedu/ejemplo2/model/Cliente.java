package org.bedu.ejemplo2.model;

public class Cliente {

    private long id;
    private String nombre;
    private String correoContacto;
    private String numeroEmpleados;
    private String direccion;

    public long getId() {
        return id;
    }
    public void setId(long id) {
        this.id = id;
    }
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public String getCorreoContacto() {
        return correoContacto;
    }
    public void setCorreoContacto(String correoContacto) {
        this.correoContacto = correoContacto;
    }
    public String getNumeroEmpleados() {
        return numeroEmpleados;
    }
    public void setNumeroEmpleados(String numeroEmpleados) {
        this.numeroEmpleados = numeroEmpleados;
    }
    public String getDireccion() {
        return direccion;
    }
    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    
}
