package com.uacm.edu.mx.models.entity;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import org.hibernate.annotations.ColumnTransformer;

import com.uacm.edu.mx.models.excepciones.ApplicacionExcepcion;
import com.uacm.edu.mx.models.service.coderror.CodigoError;

@Entity(name = "usuario")
public class Usuario {

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name = "ID_USUARIO")
	private long id;
	
	
	@Column(name = "NOMBRE")
	private String nombre;
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
	@ColumnTransformer(write=" MD5(?) ",read=" MD5(?) ")// sirve para 
	private String password;
	
	
	
	
	
	
	
	
	
	/**
	 * 
	 */
	public Usuario() {
		
	}
	/**
	 * @param nombre
	 * @param apellidoP
	 * @param apellidoM
	 * @param edad
	 * @param telefono
	 * @param direccion
	 * @param email
	 * @param password
	 */
	public Usuario( String nombre, String apellidoP, String apellidoM, int edad, String telefono,
			String direccion, String email, String password) {
		this.nombre = nombre;
		this.apellidoP = apellidoP;
		this.apellidoM = apellidoM;
		this.edad = edad;
		this.telefono = telefono;
		this.direccion = direccion;
		this.email = email;
		this.password = password;
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

			throw new ApplicacionExcepcion(CodigoError.MAL_NOMBRE_USUARIO, "El nombre no es correcto");
		}
		/*
		 * if (nombre.length() < 4 || nombre.length() > 255) { this.nombre = nombre;
		 * }else { throw new ApplicacionExcepcion(CodigoError.MAL_NOMBRE_PRODUCTO,
		 * "El nombre no es correcto"); }
		 */

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

			throw new ApplicacionExcepcion(CodigoError.ERROR_APELLIDO_PATERNO_USUARIO,"El apellido paterno no es correcto");
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

			throw new ApplicacionExcepcion(CodigoError.ERROR_APELLIDO_MATERNO_USUARIO,
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

			throw new ApplicacionExcepcion(CodigoError.ERROR_TELEFONO_USUARIO,
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
			throw new ApplicacionExcepcion(CodigoError.ERROR_DIRECION_USUARIO, "La direcion no es correcta");
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
			throw new ApplicacionExcepcion(CodigoError.ERROR_CORREO_USUARIO, "El detalle no es correcto");
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
			throw new ApplicacionExcepcion(CodigoError.ERROR_PASWORD_USUARIO, "El detalle no es correcto");
		}

	}
	@Override
	public String toString() {
		return "Usuario [id=" + id + ", nombre=" + nombre + ", apellidoP=" + apellidoP + ", apellidoM=" + apellidoM
				+ ", edad=" + edad + ", telefono=" + telefono + ", direccion=" + direccion + ", email=" + email
				+ ", password=" + password + "]";
	}
	
	
	
}
