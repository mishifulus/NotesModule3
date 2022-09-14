package org.bedu.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Cliente {
    private long id;
    private String nombre;
    private String correoContacto;

    @ToString.Exclude
    @EqualsAndHashCode.Exclude
    private int numeroEmpleados;
    
    @ToString.Exclude
    @EqualsAndHashCode.Exclude
    private String direccion;
}
