package com.pe.certus.controller;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.pe.certus.entity.Empleado;
import com.pe.certus.service.EmpleadoService;

@Controller 
@RequestMapping("/")
public class EmpleadoController { 
	
	// Logeos por consola
	
	private final Logger log = LoggerFactory.getLogger(Empleado.class); 
	@Autowired 
	private EmpleadoService empleadoService;
	
	@GetMapping("views/empleado")
	public String list(Model model) {
		List<Empleado> empleados = empleadoService.listEmpleados(); 
		model.addAttribute("currentPage", "empleado"); 
		model.addAttribute("empleados", empleados); 
		return "/views/empleado/listar"; 
	}
	
	//Muestra el formulario de create.html
	@GetMapping("views/empleado/create")
	public String create(Model model) {
		model.addAttribute("currentPage", "empleado");
		return "/views/empleado/create";
	}
	
	@PostMapping("views/empleado/save") 
	public String save(Empleado empleado) {
		log.info("Método guardar {}", empleado); 
		empleadoService.createUpdateEmpleado(empleado);
		return "redirect:/views/empleado";
	}
	
	@GetMapping("views/empleado/edit/{id}")
	public String edit(@PathVariable Long id, Model model) { 
		model.addAttribute("currentPage", "empleado");
		Empleado empleado = empleadoService.getIdEmpleado(id);
		log.info("Objeto: {}", empleado); 
		model.addAttribute("empleado", empleado); 
	    return "/views/empleado/edit"; 
	}
	
	@GetMapping("views/empleado/delete/{id}")
	public String delete(@PathVariable Long id) {
		Empleado empleado = empleadoService.getIdEmpleado(id);
		log.info("Objeto eliminado {}", empleado, id);
		empleadoService.deleteEmpleado(id);
		return "redirect:/views/empleado";
	}


}
