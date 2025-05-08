package com.oscar.springjdbc_ejercicio.repository;

import com.oscar.springjdbc_ejercicio.model.Empleado;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface EmpleadoRepository extends CrudRepository<Empleado, Integer> {
    List<Empleado> findByCodigoOficina(String codigoOficina);

}
