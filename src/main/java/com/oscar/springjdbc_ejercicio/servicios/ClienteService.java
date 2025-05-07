package com.oscar.springjdbc_ejercicio.servicios;

import com.oscar.springjdbc_ejercicio.entidades.Cliente;
import com.oscar.springjdbc_ejercicio.repositorios.ClienteRepository;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class ClienteService {

    private final ClienteRepository clienteRepository;

    public ClienteService(ClienteRepository clienteRepository) {
        this.clienteRepository = clienteRepository;
    }

    public Iterable<Cliente> listarClientes() {
        return clienteRepository.findAll();
    }

    public Optional<Cliente> buscarClientePorId(int id) {
        return clienteRepository.findById(id);
    }
}
