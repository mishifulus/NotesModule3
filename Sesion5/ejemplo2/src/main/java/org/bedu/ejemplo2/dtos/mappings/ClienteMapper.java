package org.bedu.ejemplo2.dtos.mappings;

import org.bedu.ejemplo2.dtos.ClienteDto;
import org.bedu.ejemplo2.model.Cliente;
import org.mapstruct.Mapper;

@Mapper//Para  crear el mapeo
public interface ClienteMapper {
    
    //método que transforme de un ClienteDto (que recibe como parámetro) a un Cliente
    Cliente clienteDtoToCliente(ClienteDto clienteDto);

    //recibe un objeto Cliente y regresa un objeto ClienteDto con los atribtos mapeados provenientes del Cliente
    ClienteDto clienteToClienteDto(Cliente cliente);
}
