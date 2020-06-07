package com.clavijo.ejercicio.models.dao;

import org.springframework.data.repository.CrudRepository;

import com.clavijo.ejercicio.models.entities.Alumno;

public interface IAlumno extends CrudRepository<Alumno, Integer>{

}
