package org.bedu.ejemplo3.dtos.mappings;

import org.bedu.ejemplo3.dtos.ClienteDto;
import org.bedu.ejemplo3.model.Cliente;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
//Es la configuracion para qur funcione como un componente de Spring
public interface ClienteMapper {
    
    //método que transforme de un ClienteDto (que recibe como parámetro) a un Cliente
    Cliente clienteDtoToCliente(ClienteDto clienteDto);

    // recibe un objeto Cliente y regresa un objeto ClienteDto con los atribtos mapeados provenientes del Cliente
    ClienteDto clienteToClienteDto(Cliente cliente);
}
