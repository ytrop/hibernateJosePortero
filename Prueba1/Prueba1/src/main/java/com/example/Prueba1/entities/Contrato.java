package com.example.Prueba1.entities;

import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "CONTRATO")
public class Contrato {

@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)
@Column(name = "ID")
public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	
@Column(name = "FECHA_VIGENCIA")
public Date getFechaVigencia() {
		return fechaVigencia;
	}
	public void setFechaVigencia(Date fechaVigencia) {
		this.fechaVigencia = fechaVigencia;
	}
	
@Column(name = "FECHA_CADUCIDAD")	
	public Date getFechaCaducidad() {
		return fechaCaducidad;
	}
	public void setFechaCaducidad(Date fechaCaducidad) {
		this.fechaCaducidad = fechaCaducidad;
	}
	
@Column(name = "PRECIO")	
	public Double getPrecioMensual() {
		return precioMensual;
	}
	public void setPrecioMensual(Double precioMensual) {
		this.precioMensual = precioMensual;
	}


	private Long id;
	private Date fechaVigencia;
	private Date fechaCaducidad;
	private Double precioMensual;
	


}
