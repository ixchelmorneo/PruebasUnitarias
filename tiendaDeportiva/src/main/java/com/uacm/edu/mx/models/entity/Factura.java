package com.uacm.edu.mx.models.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import java.util.Date;

@Entity(name = "factura")
public class Factura {

	
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name = "ID_Factura")
	private long id;
	
	@Column(name = "FECHA")
	@Temporal(TemporalType.DATE)
	public Date fecha;//fecha de la factura y tambien esta la fecha de la venta son distintas
	
	@Column(name = "IVA")
	public float iva;

	
	
	
	public Factura(float iva) {
		this.iva = iva;
	}

	public Factura() {
	}

	
	
	
	public float getIva() {
		return iva;
	}

	public boolean setIva(float iva) {
		this.iva = iva;
		boolean exito = false;

		if (iva < 0) {

			exito = false;
		} else if (iva < 100000) {
			exito = true;
		}

		return exito;
		
		
	}
	
	
	
	
	
}
