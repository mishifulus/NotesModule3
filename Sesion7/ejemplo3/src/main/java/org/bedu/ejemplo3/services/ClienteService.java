package org.bedu.ejemplo3.services;

import java.util.Optional;

import org.bedu.ejemplo3.model.Cliente;
import org.bedu.ejemplo3.persistance.ClienteRepository;
import org.springframework.stereotype.Service;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class ClienteService {
    
    private final ClienteRepository clienteRepository;

    public Cliente guardaCliente(Cliente cliente) {
        return clienteRepository.save(cliente);
    }

    public Optional<Cliente> obtenCliente(Long clienteId) {
        return clienteRepository.findById(clienteId);
    }
}
