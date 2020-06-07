package com.clavijo.ejercicio.models.services;

import java.util.List;

import com.clavijo.ejercicio.models.entities.Matricula;

public interface IMatriculaService {

	public void save(Matricula a);
	
	public Matricula findById(Integer id);
	
	public void delete(Integer id);
	
	public List<Matricula> findAll();
}
