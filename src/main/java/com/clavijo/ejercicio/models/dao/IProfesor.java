package com.clavijo.ejercicio.models.dao;

import org.springframework.data.repository.CrudRepository;

import com.clavijo.ejercicio.models.entities.Profesor;

public interface IProfesor extends CrudRepository<Profesor, Integer>{

}
