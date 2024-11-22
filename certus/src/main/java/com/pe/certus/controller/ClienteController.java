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

import com.pe.certus.entity.Cliente;
import com.pe.certus.service.ClienteService;

@Controller //Indica que es un controlador de Spring MVC
@RequestMapping("/") //Indica el mapeo de las URLs
public class ClienteController { 
	
	// Logeos por consola
	
	private final Logger log = LoggerFactory.getLogger(Cliente.class); //Crea un logger para registrar mensajes en la consola
	@Autowired //Inyecta automáticamente el servicio de ClienteService
	private ClienteService clienteService;
	
	@GetMapping("views/cliente") //Maneja las solicitudes HTTP GET para listar los clientes
	public String list(Model model) {
		List<Cliente> clientes = clienteService.listClientes(); //Obtiene la lista de clientes desde el servicio
		model.addAttribute("currentPage", "cliente"); //Agrega un atributo a la vista para indicar la página actual
		model.addAttribute("clientes", clientes); //Agrega la lista de clientes a la vista
		return "/views/cliente/listar"; 
	}
	
	//Muestra el formulario de create.html
	@GetMapping("views/cliente/create")
	public String create(Model model) {
		model.addAttribute("currentPage", "cliente");
		return "/views/cliente/create";
	}
	
	@PostMapping("views/cliente/save") //Maneja las solicitudes HTTP POST para guardar un cliente
	public String save(Cliente cliente) {
		log.info("Método guardar {}", cliente); //Registra un mensaje en el logger
		clienteService.createUpdateCliente(cliente);
		return "redirect:/views/cliente";
	}
	
	@GetMapping("views/cliente/edit/{id}")
	//@PathVariable Long id (captura el id de la URL)
	public String edit(@PathVariable Long id, Model model) { 
		model.addAttribute("currentPage", "cliente");
		Cliente cliente = clienteService.getIdCliente(id);
		log.info("Objeto: {}", cliente); //Registra un mensaje en el logger
		model.addAttribute("cliente", cliente); //Agrega el cliente al formulario editar
		return "/views/cliente/edit"; //Devuelve la vista de edición
	}
	
	@GetMapping("views/cliente/delete/{id}")
	public String delete(@PathVariable Long id) {
		Cliente cliente = clienteService.getIdCliente(id);
		log.info("Objeto eliminado {}", cliente, id);
		clienteService.deleteCliente(id);
		return "redirect:/views/cliente";
	}


}
