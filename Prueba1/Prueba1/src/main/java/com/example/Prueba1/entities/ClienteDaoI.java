package com.example.Prueba1.entities;

import java.util.List;

public interface ClienteDaoI {

	public Long insertar(Cliente cliente);
	
	public List<Cliente> buscarTodos();
		
	public Cliente buscarId(Long id);
		
	public void actualizarCliente(Cliente cliente);
	
	public List<Cliente> buscarPorApellidos(String apellido1,String apellido2);
		
	
}
