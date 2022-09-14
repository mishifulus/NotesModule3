package org.bedu.ejemplo1.model;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.PositiveOrZero;
import javax.validation.constraints.Size;

public class ClienteReto {

    @PositiveOrZero(message = "El identificador no puede ser un número negativo")
    private long clienteId;

    @NotEmpty(message = "El nombre del cliente no puede estar vacío")
    @Size(min = 5, max = 30, message = "El nombre del cliente debe tener al menos 5 letras y ser menor a 30")
    private String nombre;

    public long getClienteId() {
        return clienteId;
    }

    public void setId(long clienteId) {
        this.clienteId = clienteId;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
}
