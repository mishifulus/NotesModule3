package org.bedu.ejemplo1.controllers;

import java.net.URI;

import javax.validation.Valid;

import org.bedu.ejemplo1.model.VisitaReto;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RetoController {
    
    @PostMapping("/retovisita")
    public ResponseEntity<Void> creaVisita(@Valid @RequestBody VisitaReto visita){
        System.out.println("Cliente: "+visita.getCliente().getNombre());
        return ResponseEntity.created(URI.create("1")).build();
    }

    @ResponseStatus(HttpStatus.INTERNAL_SERVER_ERROR)
    @ExceptionHandler(NullPointerException.class)
    public String manejaNullPointerException(NullPointerException npe){
        return "Ocurrió un error en el servidor al procesar la petición";
    }
}
