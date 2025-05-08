package com.oscar.springjdbc_ejercicio.service;

import com.oscar.springjdbc_ejercicio.model.Cliente;
import com.oscar.springjdbc_ejercicio.repository.ClienteRepository;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class ClienteService {

    private final ClienteRepository clienteRepository;

    public ClienteService(ClienteRepository clienteRepository) {
        this.clienteRepository = clienteRepository;
    }

    public Iterable<Cliente> findAll() {
        return clienteRepository.findAll();
    }

    public Optional<Cliente> getClienteByCodigoCliente(int id) {
        return clienteRepository.findById(id);
    }
}
