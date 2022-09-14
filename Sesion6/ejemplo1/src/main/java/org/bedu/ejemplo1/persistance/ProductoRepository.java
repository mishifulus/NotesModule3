package org.bedu.ejemplo1.persistance;

import org.bedu.ejemplo1.model.Producto;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductoRepository extends JpaRepository<Producto, Long>{
    
}
