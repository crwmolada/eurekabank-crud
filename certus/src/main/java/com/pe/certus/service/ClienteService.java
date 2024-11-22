package com.pe.certus.service;

import java.util.List;

import com.pe.certus.entity.Cliente;

public interface ClienteService {
	//Esta interface lo que permite es definir el contrato de las operaciones disponibles para el cliente
	
	public List<Cliente> listClientes(); //Método para listar todos los clientes
	public Cliente getIdCliente(Long id); //Método para obtener un cliente por su ID
	public void createUpdateCliente(Cliente cliente); //Método para crear o actualizar un cliente
	public void deleteCliente(Long id); //Método para eliminar un cliente por su ID
}
