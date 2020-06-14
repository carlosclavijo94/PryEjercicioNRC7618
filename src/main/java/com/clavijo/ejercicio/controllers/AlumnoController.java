package com.clavijo.ejercicio.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.clavijo.ejercicio.models.entities.Alumno;
import com.clavijo.ejercicio.models.services.IAlumnoService;


@RequestMapping(value="/alumno")
@Controller
public class AlumnoController {
	
	//Todas las peticiones que gestiona este controlador
	//empiezan por /Alumno, p.e. https://localhost:8080/alumno/create

	@Autowired
	private IAlumnoService srvAlumno;
	
	//Cada metodo en el controlador gestiona una peticion
	//al backend a traves de una URL 
	//1 puede ser Escrita en el navegador
	//2 puede ser Hyperlynk
	//3 puede set un action de un Form
	//Los metodos son publicos
	
	@GetMapping(value="/create")//https://localhost:8080/alumno/create
	public String create(Model model) {
		Alumno alumno= new Alumno();
		model.addAttribute("title", "Registro de nuevo alumn@");
		model.addAttribute("alumno", alumno);//similar al ViewBag
		
		return "alumno/form";//La ubicacion de la vista
	}
	
	@GetMapping(value="/retrieve/{id}")
	public String retrieve(@PathVariable(value="id") Integer id,Model model){
		Alumno alumno=srvAlumno.findById(id);
		model.addAttribute("alumno", alumno);
			
		return "alumno/card";
	}
	
	@GetMapping(value="/update/{id}")
	public String update(@PathVariable(value="id") Integer id, Model model) {
		Alumno alumno=srvAlumno.findById(id);
		model.addAttribute("alumno", alumno);
		model.addAttribute("title", "Actualizando el registro de" + alumno);
		return "alumno/form";
	}
	
	@GetMapping(value="/delete/{id}")
	public String delete(@PathVariable(value="id") Integer id, Model model) {
		srvAlumno.delete(id);
		return "redirect:alumno/list";
	}
	
	@GetMapping(value="/list")
	public String list(Model model) {
		List<Alumno> alumnos= srvAlumno.findAll();
		model.addAttribute("alumnos", alumnos);
		model.addAttribute("title", "Listado de alumnos");
		return "alumno/list";
	}
	
	@PostMapping(value="/save")
	public String save(Alumno alumno, Model model) {
		srvAlumno.save(alumno);
		return "redirect:alumno/list";
	}

}
