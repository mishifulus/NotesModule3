package org.bedu.ejemplo2.dtos.mappings;

import org.bedu.ejemplo2.dtos.VisitaDto;
import org.bedu.ejemplo2.model.Visita;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;

@Mapper
public interface VisitaMapper {
    
    @Mappings({
        @Mapping(source = "fecha", target = "fechaProgramada"),
        @Mapping(source = "nombreVendedor", target = "vendedor"),
        @Mapping(source = "lugar", target = "direccion")
})
    //método que transforme de un VisitaDto (que recibe como parámetro) a un Visita
    Visita visitaDtoToVisita(VisitaDto visitaDto);

    @Mappings({
        @Mapping(source = "fechaProgramada", target = "fecha"),
        @Mapping(source = "vendedor", target = "nombreVendedor"),
        @Mapping(source = "direccion", target = "lugar")
})
    //recibe un objeto Visita y regresa un objeto VisitaDto con los atributos mapeados provenientes de la Visita
    VisitaDto visitaToVisitaDto(Visita visita);
}
