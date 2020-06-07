package com.clavijo.ejercicio.models.services;

import java.util.List;

import com.clavijo.ejercicio.models.entities.Alumno;

public interface IAlumnoService {
	
	public void save(Alumno a);
	
	public Alumno findById(Integer id);
	
	public void delete(Integer id);
	
	public List<Alumno> findAll();

}
