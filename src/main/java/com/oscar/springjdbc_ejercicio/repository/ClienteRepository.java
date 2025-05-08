package com.oscar.springjdbc_ejercicio.repository;

import com.oscar.springjdbc_ejercicio.model.Cliente;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ClienteRepository extends CrudRepository<Cliente, Integer> {
}
