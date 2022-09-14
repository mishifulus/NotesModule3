package org.bedu.ejemplo1.controllers;

import java.net.URI;
import java.util.Optional;

import org.bedu.ejemplo1.model.Producto;
import org.bedu.ejemplo1.persistance.ProductoRepository;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.server.ResponseStatusException;

import lombok.RequiredArgsConstructor;

@RestController
@RequiredArgsConstructor //Para inyectar el atributo del repositorio
@RequestMapping("/producto")
public class ProductoController {
    
    private final ProductoRepository productoRepository;

    @PostMapping
    public ResponseEntity<Void> crearCliente(@RequestBody Producto producto)
    {
        Producto productoDB = productoRepository.save(producto);
        return ResponseEntity.created(URI.create(productoDB.getId().toString())).build();
    }

    @GetMapping("/{productoId}")
    public ResponseEntity<Producto> getProducto(@PathVariable Long productoId){

        Optional<Producto> productoDB = productoRepository.findById(productoId);

        if(!productoDB.isPresent())
            throw new ResponseStatusException(HttpStatus.NOT_FOUND, "El producto especificado no existe.");

        return ResponseEntity.ok(productoDB.get());
    }
}
