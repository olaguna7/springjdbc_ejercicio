package com.oscar.springjdbc_ejercicio.servicios;

import com.oscar.springjdbc_ejercicio.entidades.Oficina;
import com.oscar.springjdbc_ejercicio.repositorios.OficinaRepository;
import org.springframework.stereotype.Service;

@Service
public class OficinaService {

    private final OficinaRepository oficinaRepository;

    public OficinaService(OficinaRepository oficinaRepository) {
        this.oficinaRepository = oficinaRepository;
    }

    public Iterable<Oficina> listarOficinas() {
        return oficinaRepository.findAll();
    }
}
