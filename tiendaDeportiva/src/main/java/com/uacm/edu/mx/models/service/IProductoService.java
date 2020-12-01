package com.uacm.edu.mx.models.service;

import java.util.List;
import java.util.Optional;

import com.uacm.edu.mx.models.entity.Producto;
import com.uacm.edu.mx.models.excepciones.ApplicacionExcepcion;

public interface IProductoService {

	Producto create(String nombre, String codigo, double precio, int stock, String detalle)
					throws  ApplicacionExcepcion;
	
	
			
			
	Optional<Producto> getById(Long id);
	List<Producto> allProducto();
	void delete(Long id);
	Producto edit(Producto producto,Producto editProducto);
}
