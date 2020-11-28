package com.uacm.edu.mx.models.service;

import com.uacm.edu.mx.models.entity.Usuario;

public interface IUsuarioService {

	public Usuario alta(String nombre, String apellidoP, String apellidoM, int edad, String telefono, String direccion,
			String email, String password);

}
