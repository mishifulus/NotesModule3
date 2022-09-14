package org.bedu.ejemplo1.model;

import java.time.LocalDate;

import javax.validation.constraints.DecimalMin;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.PastOrPresent;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.PositiveOrZero;

public class Producto {

    @PositiveOrZero(message = "El identificador no puede ser un número negativo")
    private long id;

    @NotBlank(message = "Se debe proporcionar una nombre")
    private String nombre;

    @DecimalMin(value = "1.00", inclusive = true, message = "El precio no debe ser menor a $1")
    private float precio;

    private String categoria;

    @Pattern(regexp = "^(\\d{3}[-]?){2}\\d{4}$", message = "Debe ser un número con el siguiente formato: ###-###-####; es decir: tres números, guion medio, tres números, guion medio, cuatro números.")
    private String numeroRegistro;

    @PastOrPresent(message = "No puede ocurrir después del día de hoy")
    private LocalDate fechaCreacion;

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
    public float getPrecio() {
        return precio;
    }
    public void setPrecio(float precio) {
        this.precio = precio;
    }
    public String getCategoria() {
        return categoria;
    }
    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }
    public String getNumeroRegistro() {
        return numeroRegistro;
    }
    public void setNumeroRegistro(String numeroRegistro) {
        this.numeroRegistro = numeroRegistro;
    }
    public LocalDate getFechaCreacion() {
        return fechaCreacion;
    }
    public void setFechaCreacion(LocalDate fechaCreacion) {
        this.fechaCreacion = fechaCreacion;
    }
}
