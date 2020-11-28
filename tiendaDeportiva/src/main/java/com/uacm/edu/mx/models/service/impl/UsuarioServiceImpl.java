package com.uacm.edu.mx.models.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.uacm.edu.mx.models.entity.Usuario;
import com.uacm.edu.mx.models.repository.UsuarioRepository;
import com.uacm.edu.mx.models.service.IUsuarioService;

@Service 
public class UsuarioServiceImpl implements IUsuarioService {

	@Autowired
	private UsuarioRepository usuarioRepository;
	
	
	public Usuario alta( String nombre, String apellidoP, String apellidoM, int edad, String telefono, String direccion,
	String email, String password){
		
		
		
		Usuario usuario = new Usuario();
		usuario.setNombre(nombre);
		usuario.setApellidoP(apellidoP);
		usuario.setApellidoM(apellidoM);
		usuario.setEdad(edad);
		usuario.setTelefono(telefono);
		usuario.setDireccion(direccion);
		usuario.setEmail(email);
		usuario.setPassword(password);
		
		usuario=usuarioRepository.save(usuario);
		
		
		return usuario;
		
		
		
		
	}

	

}
