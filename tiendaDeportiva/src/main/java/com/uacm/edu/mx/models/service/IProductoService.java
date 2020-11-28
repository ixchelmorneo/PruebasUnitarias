package com.uacm.edu.mx.models.service;

import java.util.List;

import com.uacm.edu.mx.models.entity.Producto;

public interface IProductoService {

	public Producto  alta(String nombreProducto,
			String codIdent,
			double precio, 
			int stock,
			String detalleProducto);
					//throws  ApplicacionExcepcion;
	
	List <Producto>  obtenerTodosProducto();
	}
