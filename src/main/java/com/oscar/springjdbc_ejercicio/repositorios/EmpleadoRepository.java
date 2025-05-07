package com.oscar.springjdbc_ejercicio.repositorios;

import com.oscar.springjdbc_ejercicio.entidades.Empleado;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EmpleadoRepository extends CrudRepository<Empleado, Integer> {
}
