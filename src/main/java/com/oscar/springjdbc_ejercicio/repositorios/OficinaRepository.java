package com.oscar.springjdbc_ejercicio.repositorios;

import com.oscar.springjdbc_ejercicio.entidades.Oficina;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface OficinaRepository extends CrudRepository<Oficina, String> {
}
