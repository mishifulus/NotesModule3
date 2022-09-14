package org.bedu.ejemplo1.persistance;

import org.bedu.ejemplo1.model.Cliente;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ClienteRepository extends JpaRepository<Cliente, Long>{
    
}
