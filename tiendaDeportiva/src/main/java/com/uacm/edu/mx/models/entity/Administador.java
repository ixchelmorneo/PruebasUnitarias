package com.uacm.edu.mx.models.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import org.hibernate.annotations.ColumnTransformer;

@Entity(name = "administrador")
public class Administador {

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
	@ColumnTransformer(write=" MD5(?) ",read=" MD5(?) ")// sirve para 
	private String password;
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
	public void setNombre(String nombre) {
		this.nombre = nombre;
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
	public void setRoll(String roll) {
		this.roll = roll;
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
	public void setApellidoP(String apellidoP) {
		this.apellidoP = apellidoP;
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
	public void setApellidoM(String apellidoM) {
		this.apellidoM = apellidoM;
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
	public void setEdad(int edad) {
		this.edad = edad;
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
	public void setTelefono(String telefono) {
		this.telefono = telefono;
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
	public void setDireccion(String direccion) {
		this.direccion = direccion;
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
	public void setEmail(String email) {
		this.email = email;
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
	public void setPassword(String password) {
		this.password = password;
	}
	@Override
	public String toString() {
		return "Administador [id=" + id + ", nombre=" + nombre + ", roll=" + roll + ", apellidoP=" + apellidoP
				+ ", apellidoM=" + apellidoM + ", edad=" + edad + ", telefono=" + telefono + ", direccion=" + direccion
				+ ", email=" + email + ", password=" + password + "]";
	}
	
	
	
	
}
