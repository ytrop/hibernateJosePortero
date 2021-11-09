package com.example.Prueba1.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name ="CLIENTE")

public class Cliente {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name ="ID_ALUMNO",precision = 15, nullable= false)
	private Long id;
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	@Column (name = "NOMBRE", nullable=false, length= 50)
	private String nombre;
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	@Column (name = "PRIMER APELLIDO", nullable=false, length= 50)
	public String getPrimerApelllido() {
		return PrimerApelllido;
	}
	public void setPrimerApelllido(String primerApelllido) {
		PrimerApelllido = primerApelllido;
	}
	@Column (name = "SEGUNDO APELLIDO", nullable=false, length= 50)
	public String getSegundoApellido() {
		return SegundoApellido;
	}
	public void setSegundoApellido(String segundoApellido) {
		SegundoApellido = segundoApellido;
	}
	
	@Column(name ="DNI", nullable= false,length = 9)
	public String getDni() {
		return Dni;
	}
	public void setDni(String dni) {
		Dni = dni;
	}
	private String PrimerApelllido;
	private String SegundoApellido;
	private String Dni;
	
}
