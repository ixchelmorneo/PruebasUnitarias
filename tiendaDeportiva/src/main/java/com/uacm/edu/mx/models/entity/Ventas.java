package com.uacm.edu.mx.models.entity;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity(name = "ventas")
public class Ventas {

	
	@Column(name = "FECHA")
	@Temporal(TemporalType.DATE)
	public Date fecha;
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name = "NO_FACTURA")
	public String No_Factura;
	
	public Ventas() {
	
	}
	
	/*Creo que en esta clase no se pueden hacer pruebas? creo seria en el contructor*/
	
	
	
}
