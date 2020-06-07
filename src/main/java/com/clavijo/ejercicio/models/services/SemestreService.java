package com.clavijo.ejercicio.models.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.clavijo.ejercicio.models.dao.ISemestre;
import com.clavijo.ejercicio.models.entities.Semestre;

@Service
public class SemestreService implements ISemestreService{

	@Autowired
	private ISemestre dao;
	
	@Override
	public void save(Semestre a) {
		dao.save(a);
	}

	@Override
	public Semestre findById(Integer id) {
		return dao.findById(id).get();
	}

	@Override
	public void delete(Integer id) {
		dao.deleteById(id);
	}

	@Override
	public List<Semestre> findAll() {
		return (List<Semestre>)dao.findAll();
	}

}
