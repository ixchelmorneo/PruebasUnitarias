package com.uacm.edu.mx.models.service.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.uacm.edu.mx.models.entity.Producto;
import com.uacm.edu.mx.models.repository.ProductoRepository;
import com.uacm.edu.mx.models.service.IProductoService;

@Service
public class ProductoServiceImpl implements IProductoService {

	@Autowired
	ProductoRepository productoRepository;

	@Override
	public Producto create(Producto producto) {

		return productoRepository.save(producto);

	}

	@Override
	public Optional<Producto> getById(Long id) {

		return productoRepository.findById(id);
	}

	@Override
	public List<Producto> allProducto() {
		
		return productoRepository.findAll();
	}

}
