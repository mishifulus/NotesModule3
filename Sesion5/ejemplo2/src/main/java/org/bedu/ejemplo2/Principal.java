package org.bedu.ejemplo2;

import java.time.LocalDateTime;

import org.bedu.ejemplo2.dtos.ClienteDto;
import org.bedu.ejemplo2.dtos.VisitaDto;
import org.bedu.ejemplo2.dtos.mappings.ClienteMapper;
import org.bedu.ejemplo2.dtos.mappings.ClienteMapperImpl;
import org.bedu.ejemplo2.dtos.mappings.VisitaMapper;
import org.bedu.ejemplo2.dtos.mappings.VisitaMapperImpl;
import org.bedu.ejemplo2.model.Cliente;
import org.bedu.ejemplo2.model.Visita;

public class Principal {

	public static void main(String[] args) {
		
		ClienteDto clienteDto = new ClienteDto();
        clienteDto.setDireccion("Direccion DTO");
        clienteDto.setNombre("Nombre cliente dto");
        clienteDto.setNumeroEmpleados("10");

		//Implementacion del mapper
        ClienteMapper clienteMapper = new ClienteMapperImpl();
		//Convierte el ClienteDto a un objeto Cliente
		Cliente clienteMapeado = clienteMapper.clienteDtoToCliente(clienteDto);

        System.out.printf("Cliente, dirección: %s%n", clienteMapeado.getDireccion());
        System.out.printf("Cliente nombre %s%n", clienteMapeado.getNombre());
        System.out.printf("Cliente numero empleados %s", clienteMapeado.getNumeroEmpleados());

		System.out.println();

		Cliente cliente = new Cliente();
        cliente.setId(1L);
        cliente.setCorreoContacto("correo@cliente.com");
        cliente.setDireccion("Dirección cliente");
        cliente.setNombre("Nombre cliente");
        cliente.setNumeroEmpleados("10");

        ClienteDto clienteDtoMapeado = clienteMapper.clienteToClienteDto(cliente);
        System.out.printf("ClienteDto, dirección: %s%n", clienteDtoMapeado.getDireccion());
        System.out.printf("ClienteDto nombre %s%n", clienteDtoMapeado.getNombre());
        System.out.printf("ClienteDto numero empleados %s%n", clienteDtoMapeado.getNumeroEmpleados());

		System.out.println();
		System.out.println();

		Visita visita = new Visita();
        visita.setDireccion("Oficina del cliente");
        visita.setFechaProgramada(LocalDateTime.now().plusDays(5));
        visita.setProposito("Presentar nuevos productos");
        visita.setVendedor("Juan Pérez");

        VisitaMapper mapper  = new VisitaMapperImpl();
		
		//Convierte el VisitaDto a un objeto Visita
		VisitaDto visitaDtoMapeada = mapper.visitaToVisitaDto(visita);

        System.out.printf("Propósito: %s%n", visitaDtoMapeada.getProposito());
        System.out.printf("Fecha de visita: %s%n", visitaDtoMapeada.getFecha());
        System.out.printf("Vendedor: %s%n%n", visitaDtoMapeada.getNombreVendedor());

		System.out.println();

		VisitaDto visitaDto = new VisitaDto();
        visitaDto.setFecha(LocalDateTime.now().plusDays(7));
        visitaDto.setLugar("Casa del cliente");
        visitaDto.setNombreVendedor("Juan Manuel");
        visitaDto.setProposito("Presentación de nuevos productos");

        Visita visitaMapeada = mapper.visitaDtoToVisita(visitaDto);

        System.out.printf("Propósito: %s%n", visitaMapeada.getProposito());
        System.out.printf("Fecha de visita: %s%n", visitaMapeada.getFechaProgramada());
        System.out.printf("Vendedor: %s%n", visitaMapeada.getVendedor());
	}

}
