package com.oscar.springjdbc_ejercicio.servicios;

import com.oscar.springjdbc_ejercicio.entidades.Empleado;
import com.oscar.springjdbc_ejercicio.repositorios.EmpleadoRepository;
import org.springframework.stereotype.Service;

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
}
