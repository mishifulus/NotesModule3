package org.bedu.reto2.dtos.mappers;

import org.bedu.reto2.dtos.EtapaDto;
import org.bedu.reto2.model.Etapa;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface EtapaMapper {
    
    //No se ingresan ninguna especificacion en los metodos ya que el mapeo es automatico
    //por la correspondencia de las propiedades
    Etapa etapaDtoToEtapa(EtapaDto etapaDto);

    EtapaDto etapatoEtapaDto(Etapa etapa);
}
