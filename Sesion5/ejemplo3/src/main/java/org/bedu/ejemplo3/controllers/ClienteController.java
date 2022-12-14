package org.bedu.ejemplo3.controllers;

import java.net.URI;

import org.bedu.ejemplo3.dtos.ClienteDto;
import org.bedu.ejemplo3.dtos.mappings.ClienteMapper;
import org.bedu.ejemplo3.model.Cliente;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import lombok.RequiredArgsConstructor;

@RestController
@RequestMapping("/cliente")
@RequiredArgsConstructor
public class ClienteController {
    
    private final ClienteMapper mapper;

    @PostMapping
    public ResponseEntity<Void> creaCliente(@RequestBody Cliente cliente){

        ClienteDto clienteDto = mapper.clienteToClienteDto(cliente);

        System.out.println(clienteDto);

        return ResponseEntity.created(URI.create("1")).build();
    }
}
