package org.bedu.ejemplo1.controllers;

import org.bedu.ejemplo1.model.Saludo;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController //Para indicar que es un controller para servicios rest
public class SaludoController {
    
    @GetMapping("/saludo") //Para indicar la ruta oara acceder al servicio
    public Saludo saludo()
    {
        Saludo saludo = new Saludo();
        saludo.setMensaje("Hola mundo!");
        return saludo;
    }

    @PostMapping("/saludar/{nombre}") //Para indicar la ruta para acceder al servicio y path variable
    public Saludo saludar(@PathVariable("nombre") String nombre)
    {
        Saludo saludo = new Saludo();
        saludo.setMensaje("Hola " + nombre + "!");
        saludo.setNombre(nombre);
        return saludo;
    }
}
