package com.oscar.springjdbc_ejercicio.service;

import com.oscar.springjdbc_ejercicio.model.Oficina;
import com.oscar.springjdbc_ejercicio.repository.OficinaRepository;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class OficinaService {

    private final OficinaRepository oficinaRepository;

    public OficinaService(OficinaRepository oficinaRepository) {
        this.oficinaRepository = oficinaRepository;
    }

    public Iterable<Oficina> listarOficinas() {
        return oficinaRepository.findAll();
    }

    public Optional<Oficina> findById(String id) {
        return oficinaRepository.findById(id);
    }
}
