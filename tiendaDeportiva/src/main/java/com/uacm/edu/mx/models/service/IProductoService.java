package com.uacm.edu.mx.models.service;

import java.util.List;
import java.util.Optional;

import com.uacm.edu.mx.models.entity.Producto;

public interface IProductoService {

	Producto create(Producto producto);
	Optional<Producto> getById(Long id);
	List<Producto> allProducto();
	void delete(Long id);
	//Producto edit(Producto producto,Producto editProducto);
}
