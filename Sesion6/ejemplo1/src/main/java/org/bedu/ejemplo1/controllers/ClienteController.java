package org.bedu.ejemplo1.controllers;

import java.net.URI;

import org.bedu.ejemplo1.model.Cliente;
import org.bedu.ejemplo1.persistance.ClienteRepository;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import lombok.RequiredArgsConstructor;

@RestController
@RequiredArgsConstructor //Para inyectar el atributo del repositorio
@RequestMapping("/cliente")
public class ClienteController {

    private final ClienteRepository clienteRepository;

    @PostMapping
    public ResponseEntity<Void> crearCliente(@RequestBody Cliente cliente)
    {
        Cliente clienteDB = clienteRepository.save(cliente); //Creamos un objeto de tipo cliente para guardarlo en la base de datos
        return ResponseEntity.created(URI.create(clienteDB.getId().toString())).build();
    }
    
}
