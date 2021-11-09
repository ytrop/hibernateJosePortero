package com.example.Prueba1;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import com.example.Prueba1.entities.Cliente;
import com.example.Prueba1.service.ClienteServiceImpl;


@SpringBootApplication
public class Prueba1Application implements CommandLineRunner {
	
@Autowired
	public ClienteServiceImpl clienteService;


	public static void main(String[] args) {
		SpringApplication.run(Prueba1Application.class, args);
	}


@Override
	public void run(String... args) throws Exception{
	
	Cliente cliente1  = new Cliente();
	Cliente cliente2  = new Cliente();
	Cliente cliente3  = new Cliente();
	
	cliente1.setNombre("Jose");
	cliente1.setPrimerApelllido("Portero");
	cliente1.setSegundoApellido("Cabrera");
	cliente1.setDni("12457865M");
	cliente2.setNombre("Maria");
	cliente2.setPrimerApelllido("Cabrera");
	cliente2.setSegundoApellido("Garcia");
	cliente2.setDni("34567890M");
	cliente3.setNombre("Ana");
	cliente3.setPrimerApelllido("Serrano");
	cliente3.setSegundoApellido("Ariza");
	cliente3.setDni("12584157F");
	
	
	Long cliente1Id = clienteService.insertar(cliente1);
	
	System.out.println("Listado de clientes:");
	List<Cliente> listado = clienteService.buscarClientes();
		for (Cliente cliente : listado) {
			System.out.println(cliente);
		}
	
	
	System.out.println("Buscar por Id");
		for (Cliente cliente : listado) {
			Cliente buscado = clienteService.buscarId(cliente.getId());
			System.out.println(buscado);
		}
	
	String newName = "Carlos";
	System.out.println(newName);
	cliente1 = clienteService.buscarId(cliente1Id);
	cliente1.setNombre(newName);
	System.out.println(cliente1);
	clienteService.actualizarClientes(cliente1);
	System.out.println("Cliente cambiado por:"+clienteService.buscarId(cliente1Id));
	
	System.out.println("Buscar cliente por apellidos.");
	String apellido1 = cliente2.getPrimerApelllido();
	String apellido2 = cliente2.getSegundoApellido();
		List<Cliente> listadoClientes = clienteService.buscarPorApellidos(apellido1,apellido2);
		for (Cliente cliente : listadoClientes) {
			System.out.println(cliente);
		}
		
	}
}


