package org.bedu.ejemplo1.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table(name= "CLIENTE")
public class Cliente {

    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    private Long id;

    private String nombre;

    @Column(name = "correo_contacto", length = 30)
    private String correoContacto;

    @Column(name = "numero_empleados")
    private int numeroEmpleados;

    private String direccion;
}
