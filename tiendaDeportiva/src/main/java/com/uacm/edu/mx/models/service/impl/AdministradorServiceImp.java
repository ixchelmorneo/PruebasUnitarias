package com.uacm.edu.mx.models.service.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.uacm.edu.mx.models.entity.Usuario;
import com.uacm.edu.mx.models.repository.AdministradorRepository;
import com.uacm.edu.mx.models.service.IAdministradorService;

@Service
public class AdministradorServiceImp implements IAdministradorService {

	@Autowired
	AdministradorRepository administradorRepository;

	@Override
	public Optional<Usuario> getById(Long id) {
		return administradorRepository.findById(id);
	}

	@Override
	public List<Usuario> allUsuario() {

		return administradorRepository.findAll();
	}

	@Override
	public void delete(Long id) {
		administradorRepository.findById(id)
				.orElseThrow(() -> new IllegalArgumentException("Invalid product Id: " + id));
		administradorRepository.deleteById(id);
	}

}
