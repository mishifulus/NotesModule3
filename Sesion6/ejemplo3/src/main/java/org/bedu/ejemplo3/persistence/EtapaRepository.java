package org.bedu.ejemplo3.persistence;

import org.bedu.ejemplo3.model.Etapa;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EtapaRepository extends JpaRepository<Etapa,Long>{
    
}
