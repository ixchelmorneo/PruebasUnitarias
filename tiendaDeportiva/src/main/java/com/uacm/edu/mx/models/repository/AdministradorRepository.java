package com.uacm.edu.mx.models.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.uacm.edu.mx.models.entity.Usuario;


public interface AdministradorRepository extends JpaRepository<Usuario, Long>{

}
