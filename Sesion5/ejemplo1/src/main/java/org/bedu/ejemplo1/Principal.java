package org.bedu.ejemplo1;

import java.time.LocalDateTime;

import org.bedu.model.Cliente;
import org.bedu.model.Visita;

public class Principal {
    public static void main(String[] args) {
        Visita visita = Visita.builder()
            .proposito("Presentar los nuevos productos")
            .direccion("Oficina del cliente")
            .fechaProgramada(LocalDateTime.now().plusDays(3))
            .vendedor("Juan Manuel")
            .build();
        //Necesita llenar todos los campos para instanciarse

        System.out.printf("Datos de la visita: %s%n", visita);

        Cliente cliente = new Cliente();
        cliente.setDireccion("Direccion");
        cliente.setCorreoContacto("ccrreo@cliente.com");
        cliente.setNombre("Clientecito");
        cliente.setNumeroEmpleados(10);

        System.out.printf("Datos del cliente %s", cliente);
    }
}
