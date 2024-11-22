package com.pe.certus.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.pe.certus.entity.Cliente;
import com.pe.certus.repository.ClienteRepository;

//Clase que implementa la lógica de negocio para el cliente

@Service //Indica que es un servicio de Spring
public class ClienteServiceIMPL implements ClienteService{
	
	@Autowired
	private ClienteRepository clienteRepository; //Inyección automática de dependencias
	
	//Método para listar todos los clientes
	@Override
	public List<Cliente> listClientes() {
		return clienteRepository.findAll();
	}

	//Método para obtener un cliente por su ID
	@Override
	public Cliente getIdCliente(Long id) {
		return clienteRepository.findById(id).orElse(null);
	}

	//Método para crear o actualizar un cliente
	@Override
	public void createUpdateCliente(Cliente cliente) {
		Cliente cli = new Cliente();
		cli.setId(cliente.getId());
		cli.setPaterno(cliente.getPaterno());
		cli.setMaterno(cliente.getMaterno());
		cli.setNombres(cliente.getNombres());
		cli.setDni(cliente.getDni());
		cli.setCiudad(cliente.getCiudad());
		cli.setCorreo(cliente.getCorreo());
		cli.setEstado(cliente.getEstado());
		if(cliente.getEstado() == null) { 
			cli.setEstado(true);
		} else {
			cli.setEstado(cliente.getEstado());
		}
		
		clienteRepository.save(cli);	
	}

	//Método para eliminar un cliente por su ID
	@Override
	public void deleteCliente(Long id) {
		clienteRepository.deleteById(id);		
	}

}
