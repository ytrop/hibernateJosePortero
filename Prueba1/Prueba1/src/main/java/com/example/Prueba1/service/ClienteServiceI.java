package com.example.Prueba1.service;
import java.util.List;
import com.example.Prueba1.entities.Cliente;


public interface ClienteServiceI {
		
	    public Long insertar(Cliente cliente);
		
		public List<Cliente> buscarClientes();
		
		public Cliente buscarId(Long id);
		
		public void actualizarClientes(Cliente cliente);
		
		public List<Cliente>buscarPorApellidos(String apellido1, String apellido2);

	


}
