package org.bedu.ejemplo1.services;

import java.util.Optional;

import org.bedu.ejemplo1.model.Cliente;

public interface ClienteService {
    
    Cliente guardaCliente(Cliente cliente);

    Optional<Cliente> obtenCliente(Long clienteId);
}
