package com.example.Prueba1.service;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.example.Prueba1.entities.Cliente;
import com.example.Prueba1.entities.ClienteDaoI;


@Service
	public class ClienteServiceImpl implements ClienteServiceI {
	
@Autowired
	ClienteDaoI clienteDao;

@Override
	public Long insertar(Cliente cliente) {
		return clienteDao.insertar(cliente);		
	}

@Override
	public List<Cliente> buscarClientes() {
		return clienteDao.buscarTodos();
	}

@Override
	public Cliente buscarId(Long id) {
		return clienteDao.buscarId(id);
	}

@Override
	public void actualizarClientes(Cliente cliente) {
		clienteDao.actualizarCliente(cliente);		
	}

@Override
	public List<Cliente> buscarPorApellidos(String apellido1, String apellido2) {
		return clienteDao.buscarPorApellidos(apellido1, apellido2);		
	}

}