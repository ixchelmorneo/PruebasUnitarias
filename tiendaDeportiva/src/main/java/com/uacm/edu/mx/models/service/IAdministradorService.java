package com.uacm.edu.mx.models.service;

import java.util.List;
import java.util.Optional;

import com.uacm.edu.mx.models.entity.Usuario;

public interface IAdministradorService {
	
	
	
	Optional<Usuario> getById(Long id);
	List<Usuario> allUsuario();
	void delete(Long id);
	
	

}
