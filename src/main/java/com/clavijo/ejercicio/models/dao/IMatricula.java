package com.clavijo.ejercicio.models.dao;

import org.springframework.data.repository.CrudRepository;

import com.clavijo.ejercicio.models.entities.Matricula;

public interface IMatricula extends CrudRepository<Matricula, Integer>{

}
