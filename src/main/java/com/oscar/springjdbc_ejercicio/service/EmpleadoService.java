package com.oscar.springjdbc_ejercicio.service;

import com.oscar.springjdbc_ejercicio.model.Empleado;
import com.oscar.springjdbc_ejercicio.repository.EmpleadoRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class EmpleadoService {

    private final EmpleadoRepository empleadoRepository;

    public EmpleadoService(EmpleadoRepository empleadoRepository) {
        this.empleadoRepository = empleadoRepository;
    }

    public Iterable<Empleado> listarEmpleados() {
        return empleadoRepository.findAll();
    }

    public Optional<Empleado> buscarEmpleadoPorId(int id) {
        return empleadoRepository.findById(id);
    }

    public List<Empleado> buscarEmpleadoPorOficina(String oficina) {
        return empleadoRepository.findAllByCodigoOficina(oficina);
    }
}
