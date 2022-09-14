package org.bedu.ejemplo2.controllers;

import org.bedu.ejemplo2.model.Saludo;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SaludoController {
    
    @PostMapping("/saludo")
    public Saludo saluda(@RequestBody Saludo saludo)
    {
        return saludo;
    }

    @PutMapping("/saludar")
    public Saludo saludar(@RequestBody Saludo saludo)
    {
        return saludo;
    }

    //Para devolver solo el estatus
    //Para probar:
    //http://localhost:8080/nosaludar?id=Citlalli
    @DeleteMapping("/nosaludar")
    public ResponseEntity saludo(@RequestParam String id)
    {
        return ResponseEntity.status(HttpStatus.OK).build();
    }
}
