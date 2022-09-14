package org.bedu.ejemplo1.controllers;

import java.net.URI;

import javax.lang.model.util.ElementScanner6;

import org.bedu.ejemplo1.model.Producto;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.server.ResponseStatusException;

@RestController
@RequestMapping("/producto")
public class ProductoController {

    @PostMapping("/crear")
    public ResponseEntity<Void> crearCliente(@RequestBody Producto producto)
    {
        /*if (producto.getPrecio() >= 1.00 && producto.getNombre() != null) //!producto.getNombre().isBlank()
        {
            throw new ResponseStatusException(HttpStatus.CREATED, "Producto creado.");
        }
        else if (producto.getId() > 0)
        {
            throw new ResponseStatusException(HttpStatus.NOT_FOUND, "Producto no encontrado.");
        }
        else
        {
            throw new ResponseStatusException(HttpStatus.BAD_REQUEST, "No se ingreso ningun parametro.");
        }*/
        return ResponseEntity.created(URI.create("")).build();

    }

    @GetMapping(value = "/{productoId}")
    public ResponseEntity<Producto> getProducto(@PathVariable long productoId){
        Producto producto = new Producto();
        producto.setNombre("Productito");
        producto.setId(productoId);
        producto.setPrecio(1.00f); //f = float

        return ResponseEntity.ok(producto);
    }
    
}
