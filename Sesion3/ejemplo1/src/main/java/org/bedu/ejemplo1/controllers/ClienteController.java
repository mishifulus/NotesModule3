package org.bedu.ejemplo1.controllers;

import java.net.URI;

import javax.validation.Valid;

import org.bedu.ejemplo1.model.Cliente;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ClienteController {
    
    //Valid es para que revise todas las validaciones ingresadas en el modelo
    @PostMapping("/cliente")
    public ResponseEntity<Void> creaCliente(@Valid @RequestBody Cliente cliente){
        System.out.println(cliente.getNombre());
        return ResponseEntity.created(URI.create("1")).build();
    }
}
