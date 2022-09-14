package org.bedu.ejemplo1.model;

import java.time.LocalDateTime;
import java.util.Map;

import org.bedu.ejemplo1.model.builders.RespuestaErrorBuilder;

public class RespuestaError {
    
    private final LocalDateTime timestamp = LocalDateTime.now();
    private int estatus;
    private Map<String, String> errores;
    private String ruta;

    public LocalDateTime getTimestamp() {
        return timestamp;
    }

    public int getEstatus() {
        return estatus;
    }

    public void setEstatus(int estatus) {
        this.estatus = estatus;
    }

    public Map<String, String> getErrores() {
        return errores;
    }

    public void setErrores(Map<String, String> errores) {
        this.errores = errores;
    }

    public String getRuta() {
        return ruta;
    }

    public void setRuta(String ruta) {
        this.ruta = ruta;
    }

    //El método builder permitirá crear las instancias de esta 
    //clase y a continuación crearás la clase que implementa este patrón de diseño.
    public static RespuestaErrorBuilder builder() {
        return new RespuestaErrorBuilder();
    }
    
}
