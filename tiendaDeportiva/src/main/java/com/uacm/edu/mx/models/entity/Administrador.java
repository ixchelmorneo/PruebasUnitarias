package com.uacm.edu.mx.models.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import com.uacm.edu.mx.models.excepciones.ApplicacionExcepcion;
import com.uacm.edu.mx.models.service.coderror.CodigoError;

@Entity(name = "administrador")
public class Administrador {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "ID_AMINISTRADOR")
	private long id;

	@Column(name = "NOMBRE")
	private String nombre;
	@Column(name = "ROLL")
	private String roll;
	@Column(name = "APELLIDOP")
	private String apellidoP;
	@Column(name = "APELLIDOM")
	private String apellidoM;
	@Column(name = "EDAD")
	private int edad;
	@Column(name = "TELEFONO")
	private String telefono;
	@Column(name = "DIRECCION")
	private String direccion;
	@Column(name = "CORREO")
	private String email;
	@Column(name = "PASWORD")
	private String password;

	public Administrador(String nombre, String roll, String apellidoP, String apellidoM, int edad,
			String telefono, String direccion, String email, String password) {
		
		this.nombre = nombre;
		this.roll = roll;
		this.apellidoP = apellidoP;
		this.apellidoM = apellidoM;
		this.edad = edad;
		this.telefono = telefono;
		this.direccion = direccion;
		this.email = email;
		this.password = password;
	}

	public Administrador() {

	}

	/**
	 * @return the id
	 */
	public long getId() {
		return id;
	}

	/**
	 * @param id the id to set
	 */
	public void setId(long id) {
		this.id = id;
	}

	/**
	 * @return the nombre
	 */
	public String getNombre() {
		return nombre;
	}

	/**
	 * @param nombre the nombre to set
	 */
	public void setNombre(String nombre) throws ApplicacionExcepcion {
		this.nombre = nombre;

		if (!(nombre.matches("^[ A-Za-z]+$"))) {

			this.nombre = nombre;
		} else {

			throw new ApplicacionExcepcion(CodigoError.MAL_NOMBRE_ADMINISTRADOR, "El nombre no es correcto");
		}
		/*
		 * if (nombre.length() < 4 || nombre.length() > 255) { this.nombre = nombre;
		 * }else { throw new ApplicacionExcepcion(CodigoError.MAL_NOMBRE_PRODUCTO,
		 * "El nombre no es correcto"); }
		 */

	}

	/**
	 * @return the roll
	 */
	public String getRoll() {
		return roll;
	}

	/**
	 * @param roll the roll to set
	 */
	public void setRoll(String roll) throws ApplicacionExcepcion {
		this.roll = roll;
		if (!(roll.matches("^[Administrador]$"))) {

			this.roll = roll;
		} else {

			throw new ApplicacionExcepcion(CodigoError.ERROR_ROLL_ADMINISTRADOR, "El roll no es correcto");
		}

	}

	/**
	 * @return the apellidoP
	 */
	public String getApellidoP() {
		return apellidoP;
	}

	/**
	 * @param apellidoP the apellidoP to set
	 */
	public void setApellidoP(String apellidoP) throws ApplicacionExcepcion {
		this.apellidoP = apellidoP;

		if (!(apellidoP.matches("^[ A-Za-z]+$"))) {

			this.apellidoP = apellidoP;
		} else {

			throw new ApplicacionExcepcion(CodigoError.ERROR_APELLIDO_PATERNO_ADMINISTRADOR,"El apellido paterno no es correcto");
		}

	}

	/**
	 * @return the apellidoM
	 */
	public String getApellidoM() {
		return apellidoM;
	}

	/**
	 * @param apellidoM the apellidoM to set
	 */
	public void setApellidoM(String apellidoM) throws ApplicacionExcepcion {
		this.apellidoM = apellidoM;

		if (!(apellidoM.matches("^[ A-Za-z]+$"))) {

			this.apellidoM = apellidoM;
		} else {

			throw new ApplicacionExcepcion(CodigoError.ERROR_APELLIDO_MATERNO_ADMINISTRADOR,
					"El apellido materno no es correcto");
		}
	}

	/**
	 * @return the edad
	 */
	public int getEdad() {
		return edad;
	}

	/**
	 * @param edad the edad to set
	 */
	public boolean setEdad(int edad) {
		this.edad = edad;

		
		
		boolean exito = false;

		if (edad > 0) {

			exito = false;
		} else if (edad < 100) {
			exito = true;
		}
		
		return exito;		
		
		
	}

	/**
	 * @return the telefono
	 */
	public String getTelefono() {
		return telefono;
	}

	/**
	 * @param telefono the telefono to set
	 */
	public void setTelefono(String telefono) throws ApplicacionExcepcion {
		this.telefono = telefono;
		if (!(telefono.matches("([55]-([0-9][ -]*)){8}"))) {

			this.telefono = telefono;

		} else {

			throw new ApplicacionExcepcion(CodigoError.ERROR_TELEFONO_ADMINISTRADOR,
					"El telefono del administrador no es correcto");
		}

	}

	/**
	 * @return the direccion
	 */
	public String getDireccion() {
		return direccion;
	}

	/**
	 * @param direccion the direccion to set
	 */
	public void setDireccion(String direccion) throws ApplicacionExcepcion {
          //\d+[ ](?:[A-Za-z0-9.-]+[ ]?)+
		//^[#.0-9a-zA-Z,-]+$
		if (!(direccion.matches("^[#.0-9a-zA-Z,-]+"))) {
			this.direccion = direccion;
		} else {
			throw new ApplicacionExcepcion(CodigoError.ERROR_DIRECION_ADMINISTRADOR, "La direcion no es correcta");
		}

	}

	/**
	 * @return the email
	 */
	public String getEmail() {
		return email;
	}

	/**
	 * @param email the email to set
	 */
	public void setEmail(String email) throws ApplicacionExcepcion {

		if (!(email.matches("^([a-z0-9_\\.-]+)@([\\da-z\\.-]+)\\.([a-z\\.]{2,6})$"))) {
			this.email = email;
		} else {
			throw new ApplicacionExcepcion(CodigoError.ERROR_CORREO_ADMINISTRADOR, "El detalle no es correcto");
		}

	}

	/**
	 * @return the password
	 */
	public String getPassword() {
		return password;
	}

	/**
	 * @param password the password to set
	 */
	public void setPassword(String password) throws ApplicacionExcepcion {

		if (!(password.matches("^[a-z0-9_-]{6,18}$"))) {
			this.password = password;
		} else {
			throw new ApplicacionExcepcion(CodigoError.ERROR_PASWORD_ADMINISTRADOR, "El detalle no es correcto");
		}

	}

	@Override
	public String toString() {
		return "Administador [id=" + id + ", nombre=" + nombre + ", roll=" + roll + ", apellidoP=" + apellidoP
				+ ", apellidoM=" + apellidoM + ", edad=" + edad + ", telefono=" + telefono + ", direccion=" + direccion
				+ ", email=" + email + ", password=" + password + "]";
	}

}