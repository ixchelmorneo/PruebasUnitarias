package com.uacm.edu.mx.models.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.thymeleaf.expression.Lists;

import com.uacm.edu.mx.models.entity.Producto;
import com.uacm.edu.mx.models.repository.ProductoRepository;
import com.uacm.edu.mx.models.service.IProductoService;

public class ProductoServiceImpl implements IProductoService {
	
	@Autowired
	ProductoRepository productoRepository;

	@Override
	public Producto alta(String nombreProducto, String codIdent, double precio, int stock, String detalleProducto) {
		Producto p= new Producto();
		p.setNombreProducto(nombreProducto);
		p.setCodIdent(codIdent);
		p.setPrecio(precio);
		p.setStock(stock);
		p.setDetalleProducto(detalleProducto);
		
		
		
		p=productoRepository.save(p);
		
		return p;
		
	}
	
	
public Producto buscarXId(Long id) {
		
		return productoRepository.findOne(id);
		
	}
	
	

	@Override
	public List<Producto> obtenerTodosProducto() {
		// TODO Auto-generated method stub
		return Lists.newArrayList(productoRepository.findAll());
	}

}
