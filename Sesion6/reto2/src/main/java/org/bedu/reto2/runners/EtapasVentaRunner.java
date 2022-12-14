package org.bedu.reto2.runners;

import java.util.Arrays;
import java.util.List;

import org.bedu.reto2.dtos.EtapaDto;
import org.bedu.reto2.dtos.mappers.EtapaMapper;
import org.bedu.reto2.model.Etapa;
import org.bedu.reto2.persistence.EtapaRepository;
import org.mapstruct.factory.Mappers;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
@Component
public class EtapasVentaRunner implements CommandLineRunner{

    //Inyectamos el repositorio con el constructor
    private final EtapaRepository etapaRepository;

    //Instanciar el mapeo de los atributos
    private EtapaMapper etapaMapper = Mappers.getMapper(EtapaMapper.class);

    @Override
    public void run(String... args) throws Exception {
        Etapa etapa1 = etapaMapper.etapaDtoToEtapa(EtapaDto.builder().nombre("En espera").orden(0).build());
        Etapa etapa2 = etapaMapper.etapaDtoToEtapa(EtapaDto.builder().nombre("Reunión de exploración").orden(1).build());
        Etapa etapa3 = etapaMapper.etapaDtoToEtapa(EtapaDto.builder().nombre("Metas establecidas").orden(2).build());
        Etapa etapa4 = etapaMapper.etapaDtoToEtapa(EtapaDto.builder().nombre("Plan de acción presentado").orden(3).build());
        Etapa etapa5 = etapaMapper.etapaDtoToEtapa(EtapaDto.builder().nombre("Contrato firmado").orden(4).build());
        Etapa etapa6 = etapaMapper.etapaDtoToEtapa(EtapaDto.builder().nombre("Venta ganada").orden(5).build());
        Etapa etapa7 = etapaMapper.etapaDtoToEtapa(EtapaDto.builder().nombre("Venta perdida").orden(6).build());

        List<Etapa> etapas = Arrays.asList(etapa1, etapa2, etapa3, etapa4, etapa5, etapa6, etapa7);

        etapaRepository.saveAll(etapas);
        
    }
    
}
