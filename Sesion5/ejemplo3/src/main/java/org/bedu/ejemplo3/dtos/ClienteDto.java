package org.bedu.ejemplo3.dtos;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class ClienteDto {
    
    private String nombre;
    private String numeroEmpleados;
    private String direccion;
}
