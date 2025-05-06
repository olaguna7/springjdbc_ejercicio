package com.oscar.springjdbc_ejercicio.repositorios;

import com.oscar.springjdbc_ejercicio.entidades.Cliente;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CienteRepository extends CrudRepository<Cliente, Integer> {
}
