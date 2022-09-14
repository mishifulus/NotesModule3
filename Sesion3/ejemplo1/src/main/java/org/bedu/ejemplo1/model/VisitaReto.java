package org.bedu.ejemplo1.model;

import java.time.LocalDateTime;

import javax.validation.constraints.Future;
import javax.validation.constraints.PositiveOrZero;

public class VisitaReto {
    
    @PositiveOrZero(message = "El identificador de la visita no puede ser un número negativo.")
    private long id;

    private ClienteReto cliente;

    @Future(message = "La fecha de la cita no puede ser en una fecha en el pasado.")
    private LocalDateTime fechaProgramada;
    
    public long getId() {
        return id;
    }
    public void setId(long id) {
        this.id = id;
    }
    public ClienteReto getCliente() {
        return cliente;
    }
    public void setCliente(ClienteReto cliente) {
        this.cliente = cliente;
    }
    public LocalDateTime getFechaProgramada() {
        return fechaProgramada;
    }
    public void setFechaProgramada(LocalDateTime fechaProgramada) {
        this.fechaProgramada = fechaProgramada;
    }

    
}
