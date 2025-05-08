package com.oscar.springjdbc_ejercicio.repository;

import com.oscar.springjdbc_ejercicio.model.Oficina;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface OficinaRepository extends CrudRepository<Oficina, String> {
}
