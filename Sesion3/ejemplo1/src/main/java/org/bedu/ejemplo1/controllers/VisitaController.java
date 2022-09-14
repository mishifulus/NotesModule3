package org.bedu.ejemplo1.controllers;

import java.net.URI;
import java.util.HashMap;
import java.util.Map;

import javax.validation.Valid;

import org.bedu.ejemplo1.model.Visita;
import org.springframework.http.ResponseEntity;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.*;
import org.springframework.validation.FieldError;

@RestController
public class VisitaController {
    
    //Valid es para que revise todas las validaciones ingresadas en el modelo
    @PostMapping("/visita")
    public ResponseEntity<Void> creaVisita(@Valid @RequestBody Visita visita){
        return ResponseEntity.created(URI.create("1")).build();
    }

    @ResponseStatus(HttpStatus.BAD_REQUEST) //Indica el estado a mostrar
    @ExceptionHandler(MethodArgumentNotValidException.class) //Indica que se van a manejar las exepciones de validacion
    public Map<String, String> handleValidationExceptions(MethodArgumentNotValidException ex) {
        
        Map<String, String> errors = new HashMap<>();

        ex.getBindingResult().getAllErrors().forEach((error) -> {
            String fieldName = ((FieldError) error).getField();
            String errorMessage = error.getDefaultMessage();
            errors.put(fieldName, errorMessage);
        });
        
        return errors;     
    }
}