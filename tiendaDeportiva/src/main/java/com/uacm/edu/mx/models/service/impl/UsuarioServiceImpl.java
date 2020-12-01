package com.uacm.edu.mx.models.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.uacm.edu.mx.models.entity.Usuario;
import com.uacm.edu.mx.models.repository.UsuarioRepository;
import com.uacm.edu.mx.models.service.IUsuarioService;

@Service
public class UsuarioServiceImpl implements IUsuarioService {

	@Autowired
	UsuarioRepository usuarioRepository;
	
	@Override
	public Usuario create(Usuario usuario) {
		// TODO Auto-generated method stub
		return usuarioRepository.save(usuario);
	}
	
	
	
	
	
	
	
	
	

}
