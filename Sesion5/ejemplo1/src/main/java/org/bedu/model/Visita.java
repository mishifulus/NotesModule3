package org.bedu.model;

import java.time.LocalDateTime;

import lombok.Builder;
import lombok.Data;

@Data //Genera getters, setters, equals, hashcode y toString menos para FINAL
//Tambien crea un constructor para las variables FINAL
@Builder //Patron builder para hacer un getter y setter con todos los elementos
public class Visita {

    private long id;
    private final LocalDateTime fechaProgramada;
    private String direccion;
    private String proposito;
    private final String vendedor;
}
