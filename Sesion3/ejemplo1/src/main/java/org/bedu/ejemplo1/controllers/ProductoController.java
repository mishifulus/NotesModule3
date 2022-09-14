package org.bedu.ejemplo1.controllers;

import javax.validation.Valid;

import org.bedu.ejemplo1.model.Producto;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ProductoController {
    
    @PostMapping("/producto")
    public ResponseEntity<Void> creaProducto(@Valid @RequestBody Producto producto){
        return ResponseEntity.ok().build();
    }
}
