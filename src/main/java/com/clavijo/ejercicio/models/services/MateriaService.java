package com.clavijo.ejercicio.models.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.clavijo.ejercicio.models.dao.IMateria;
import com.clavijo.ejercicio.models.entities.Materia;

@Service
public class MateriaService implements IMateriaService{

	@Autowired
	private IMateria dao;
	
	@Override
	@Transactional
	public void save(Materia a) {
		dao.save(a);
	}

	@Override
	@Transactional
	public Materia findById(Integer id) {
		return dao.findById(id).get();
	}

	@Override
	@Transactional
	public void delete(Integer id) {
		dao.deleteById(id);
	}

	@Override
	@Transactional
	public List<Materia> findAll() {
		return (List<Materia>)dao.findAll();
	}

}
