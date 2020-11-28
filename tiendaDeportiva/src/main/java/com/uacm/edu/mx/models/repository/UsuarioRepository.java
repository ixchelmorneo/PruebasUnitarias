package com.uacm.edu.mx.models.repository;

import org.springframework.data.repository.CrudRepository;

import com.uacm.edu.mx.models.entity.Usuario;

public interface UsuarioRepository extends CrudRepository<Usuario, Long> {

}
