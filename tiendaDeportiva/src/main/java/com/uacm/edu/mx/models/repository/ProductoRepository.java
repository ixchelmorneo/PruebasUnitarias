package com.uacm.edu.mx.models.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.uacm.edu.mx.models.entity.Producto;


@Repository
public interface ProductoRepository extends JpaRepository<Producto, Long>{

}
