package com.uacm.edu.mx.models.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity(name = "producto")
public class Producto {

	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "ID_PORODUCTO")
	private Long id;

	@Column(name = "NOMBRE_PRODUCTO")
	private String nombreProducto;

	@Column(name = "CODIGO_IDENTIFICACION")
	private String codIdent;

	@Column(name = "PRECIO")
	private double precio;

	@Column(name = "STOCK")
	private int stock;
	
	@Column(name="DETALLE")
	private String detalleProducto;

	/**
	 * @return the id
	 */
	public Long getId() {
		return id;
	}

	/**
	 * @param id the id to set
	 */
	public void setId(Long id) {
		this.id = id;
	}

	/**
	 * @return the nombreProducto
	 */
	public String getNombreProducto() {
		return nombreProducto;
	}

	/**
	 * @param nombreProducto the nombreProducto to set
	 */
	public void setNombreProducto(String nombreProducto) {
		this.nombreProducto = nombreProducto;
	}

	/**
	 * @return the codIdent
	 */
	public String getCodIdent() {
		return codIdent;
	}

	/**
	 * @param codIdent the codIdent to set
	 */
	public void setCodIdent(String codIdent) {
		this.codIdent = codIdent;
	}

	/**
	 * @return the precio
	 */
	public double getPrecio() {
		return precio;
	}

	/**
	 * @param precio the precio to set
	 */
	public void setPrecio(double precio) {
		this.precio = precio;
	}

	/**
	 * @return the stock
	 */
	public int getStock() {
		return stock;
	}

	/**
	 * @param stock the stock to set
	 */
	public void setStock(int stock) {
		this.stock = stock;
	}

	/**
	 * @return the detalleProducto
	 */
	public String getDetalleProducto() {
		return detalleProducto;
	}

	/**
	 * @param detalleProducto the detalleProducto to set
	 */
	public void setDetalleProducto(String detalleProducto) {
		this.detalleProducto = detalleProducto;
	}

	@Override
	public String toString() {
		return "Producto [id=" + id + ", nombreProducto=" + nombreProducto + ", codIdent=" + codIdent + ", precio="
				+ precio + ", stock=" + stock + ", detalleProducto=" + detalleProducto + "]";
	}
	
	
	
	
}
