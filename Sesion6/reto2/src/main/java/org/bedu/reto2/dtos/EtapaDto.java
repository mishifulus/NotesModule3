package org.bedu.reto2.dtos;

import lombok.Builder;
import lombok.Data;

@Builder
@Data
public class EtapaDto {
    private Long etapaId;
    private String nombre;
    private Integer orden;
}
