package org.bedu.ejemplo1.runners;

import java.util.Arrays;
import java.util.List;

import org.bedu.ejemplo1.model.Etapa;
import org.bedu.ejemplo1.persistance.EtapaRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
@Component
public class EtapasVentaRunner implements CommandLineRunner{

    private final EtapaRepository etapaRepository;

    //Acciones que se crean en un hilo automaticamente al iniciar el programa
    @Override
    public void run(String... args) throws Exception {
        Etapa etapa1 = creaEtapa("En espera", 0);
        Etapa etapa2 = creaEtapa("Reunión de exploración", 1);
        Etapa etapa3 = creaEtapa("Metas establecidas", 2);
        Etapa etapa4 = creaEtapa("Plan de acción presentado.", 3);
        Etapa etapa5 = creaEtapa("Contrato firmado", 4);
        Etapa etapa6 = creaEtapa("Venta ganada", 5);
        Etapa etapa7 = creaEtapa("Venta perdida", 6);
        
        List<Etapa> etapas = Arrays.asList(etapa1, etapa2, etapa3, etapa4, etapa5, etapa6, etapa7);
        etapaRepository.saveAll(etapas);
    }

    private Etapa creaEtapa(String nombre, Integer orden) {
        Etapa etapa = new Etapa();
        etapa.setNombre(nombre);
        etapa.setOrden(orden);

        return etapa;
    }
    
}
