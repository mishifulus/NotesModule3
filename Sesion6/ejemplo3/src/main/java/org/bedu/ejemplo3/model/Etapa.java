package org.bedu.ejemplo3.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table(name = "ETAPAS_EJEMPLO")
public class Etapa {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long etapaId;

    @Column(nullable = false, length = 100)
    private String nombre;

    @Column(nullable = false, unique = true)
    private Integer orden;
}

// http://localhost:8080/h2-console/
// para abrir la consola de H2

// Driver Class: org.hibernate.dialect.MySQL5Dialect
// JDBC URL: jdbc:mysql://localhost:3306/bedu?serverTimezone=UTC
// USER: root
// PASSWORD: Citlalli123

