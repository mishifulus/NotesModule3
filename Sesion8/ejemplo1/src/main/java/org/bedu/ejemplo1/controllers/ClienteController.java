package org.bedu.ejemplo1.controllers;

import java.net.URI;

import org.bedu.ejemplo1.model.Cliente;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/cliente")
public class ClienteController {
    
    @GetMapping("/{clienteId}")
    public ResponseEntity<Cliente> getCliente(@PathVariable Long clienteId)
    {
        return ResponseEntity.ok(Cliente.builder().id(1L).correoContacto("cliente@contacto.com").nombre("Nombre").build());
    }

    @PostMapping
    public ResponseEntity<Void> crearCliente(@RequestBody Cliente cliente)
    {
        return ResponseEntity.created(URI.create("1")).build();
    }
}
