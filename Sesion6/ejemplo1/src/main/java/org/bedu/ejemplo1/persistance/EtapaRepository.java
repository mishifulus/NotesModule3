package org.bedu.ejemplo1.persistance;

import org.bedu.ejemplo1.model.Etapa;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EtapaRepository extends JpaRepository<Etapa, Long>{
    
}
