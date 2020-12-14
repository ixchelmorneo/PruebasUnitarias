package com.uacm.edu.mx.models.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import com.uacm.edu.mx.models.excepciones.ApplicacionExcepcion;
import com.uacm.edu.mx.models.service.coderror.CodigoError;

@Entity(name = "p_producto")
public class Producto {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	@Column(name = "nombre")
	private String nombre;

	@Column(name = "codigo")
	private String codigo;

	@Column(name = "precio")
	private double precio;

	@Column(name = "stock")
	private int stock;

	@Column(name = "detalle")
	private String detalle;

	public Producto() {

	}

	public Producto(String nombre, String codigo, double precio, int stock, String detalle)
			throws ApplicacionExcepcion {
		// if(!(nombre.matches("^[ A-Za-z]+$") && codigo.matches("{0-9}{11}") &&
		// precio>0 || precio<10000 && stock<5 || stock>70 && detalle.matches("^[
		// A-Za-z]+$")))
		if (nombre.matches("^[ A-Za-z]+$") && codigo.matches("^([0-9])*") && precio > 0 || precio < 1000 && stock < 5
				|| stock > 70 && detalle.matches("^[ A-Za-z]+$")) {
			this.nombre = nombre;
			this.codigo = codigo;
			this.precio = precio;
			this.stock = stock;
			this.detalle = detalle;
		} else {
			throw new ApplicacionExcepcion(CodigoError.ERROR_CONTRUCTOR, "Argumentos invalidos");
		}
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) { // se tiene que testear?
		this.id = id;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) throws ApplicacionExcepcion {
		// if
		// (!(nombre.matches("^([A-Z]{1}[a-z\\u00E1\r\n+\\\\u00E9\\r\\n+\\\\u00ED\\r\\n+\\\\u00F3\\r\\n+\\\\u00FA\\r\\n+\\\\u00F1\\r\\n+]+[]?){1,10}$")))
		// {
		if (!(nombre.matches("^[ A-Za-z]+$"))) {

			this.nombre = nombre;
		} else {

			throw new ApplicacionExcepcion(CodigoError.MAL_NOMBRE_PRODUCTO, "El nombre no es correcto");
		}
		/*
		 * if (nombre.length() < 4 || nombre.length() > 255) { this.nombre = nombre;
		 * }else { throw new ApplicacionExcepcion(CodigoError.MAL_NOMBRE_PRODUCTO,
		 * "El nombre no es correcto"); }
		 */

	}

	public String getCodigo() {
		return codigo;
	}

	public void setCodigo(String codigo) throws ApplicacionExcepcion {
		this.codigo = codigo;

		if (!(codigo.matches("^([0-9])*"))) {

			this.codigo = codigo;

		} else {

			throw new ApplicacionExcepcion(CodigoError.MAL_CODIDENT,
					"El codigo de identificacion del producto no es correcto");
		}

		/*
		 * if ((codigo.length()<12)) { throw new
		 * ApplicacionExcepcion(CodigoError.MAL_CODIDENT,
		 * "El codigo de identificacion del producto no es correcto"); }
		 */

	}

	public double getPrecio() {
		return precio;
	}

	public boolean setPrecio(double precio) {

		this.precio = precio;
		boolean exito = false;

		if (precio > 0) {

			exito = true;
		} else if (precio < 1000) {
			exito = false;
		}

		return exito;
	}

	public int getStock() {
		return stock;
	}

	public boolean setStock(int stock) {

		boolean exito = false;
		this.stock = stock;

		if (stock > 5) {

			exito = true;
		} else if (stock < 70) {

			exito = false;
		}

		return exito;

	}

	public String getDetalle() {
		return detalle;
	}

	public void setDetalle(String detalle) throws ApplicacionExcepcion {

		if (!(detalle.matches("^[ A-Za-z-0-9]+$"))) {
			this.detalle = detalle;
		} else {
			throw new ApplicacionExcepcion(CodigoError.ERROR_DETALLE, "El detalle no es correcto");
		}

		/*
		 * if ((detalle.length()<4)) { throw new
		 * ApplicacionExcepcion(CodigoError.ERROR_DETALLE, "El detalle no es correcto");
		 * }
		 * 
		 * if ((detalle.length()>255)) { throw new
		 * ApplicacionExcepcion(CodigoError.ERROR_DETALLE, "El detalle no es correcto");
		 * }
		 */

	}

	@Override
	public String toString() {
		return "Producto [id=" + id + ", nombre=" + nombre + ", codigo=" + codigo + ", precio=" + precio + ", stock="
				+ stock + ", detalle=" + detalle + "]";
	}

}
