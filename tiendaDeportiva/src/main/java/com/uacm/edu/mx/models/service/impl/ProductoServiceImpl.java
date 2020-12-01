package com.uacm.edu.mx.models.service.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.uacm.edu.mx.models.entity.Producto;
import com.uacm.edu.mx.models.excepciones.ApplicacionExcepcion;
import com.uacm.edu.mx.models.repository.ProductoRepository;
import com.uacm.edu.mx.models.service.IProductoService;
import com.uacm.edu.mx.models.service.coderror.CodigoError;

@Service
public class ProductoServiceImpl implements IProductoService {

	//public static final Logger log = Logger.getLogger(ProductoServiceImpl.class);
	
	@Autowired
	ProductoRepository productoRepository;

	@Override
	public Producto create(String nombre, String codigo, double precio, int stock, String detalle) 
			throws ApplicacionExcepcion  {
		
		
		//if (log.isDebugEnabled())
			//log.debug("Entrando a ProductoServiceImpl.alta");
		
		Producto producto;
		
		if (!(nombre.matches("^[ A-Za-z]+$"))) {
			throw new ApplicacionExcepcion(CodigoError.MAL_NOMBRE_PRODUCTO, "El nombre no es correcto");
		}
		
		if (nombre.length() < 4 || nombre.length() > 255) {
			throw new ApplicacionExcepcion(CodigoError.MAL_NOMBRE_PRODUCTO, "El nombre no es correcto");
		}
		
		if (!(codigo.matches("^[0-9]{12}"))) {
			throw new ApplicacionExcepcion(CodigoError.MAL_CODIDENT, "El codigo de identificacion del producto no es correcto");
		}
		
		if ((codigo.length()<12)) {
			throw new ApplicacionExcepcion(CodigoError.MAL_CODIDENT, "El codigo de identificacion del producto no es correcto");
		}
		
		if ((codigo.length()>12)) {
			throw new ApplicacionExcepcion(CodigoError.MAL_CODIDENT, "El codigo de identificacion del producto no es correcto");
		}
		
		if ((precio<=0.0) ){
			throw new ApplicacionExcepcion(CodigoError.ERROR_PRECIO, "El precio  es menor a 0");
		}
		
		if ((precio>7000.00) ){
			throw new ApplicacionExcepcion(CodigoError.ERROR_PRECIO, "El precio  es mayor a 7000");
		}
		
		if ((stock <5||stock>70) ){
			throw new ApplicacionExcepcion(CodigoError. ERROR_STOCK, "El stock  es incorrecto");
		}
		
		if (!(detalle.matches("^[ A-Za-z-0-9]+$"))) {
			throw new ApplicacionExcepcion(CodigoError.ERROR_DETALLE, "El detalle no es correcto");
		}
		
		if ((detalle.length()<4)) {
			throw new ApplicacionExcepcion(CodigoError.ERROR_DETALLE, "El detalle no es correcto");
		}
		
		if ((detalle.length()>255)) {
			throw new ApplicacionExcepcion(CodigoError.ERROR_DETALLE, "El detalle no es correcto");
}
		

		
		
		
		
		Producto p= new Producto();
		p.setNombre(nombre);
		p.setCodigo(codigo);
		p.setPrecio(precio);
		p.setStock(stock);
		p.setDetalle(detalle);
		
		
		
		producto=productoRepository.save(p);
		
		return producto;
		
		
		// TODO Auto-generated method stub
		
	}	
	
	

	@Override
	public Optional<Producto> getById(Long id) {

		return productoRepository.findById(id);
	}

	@Override
	public List<Producto> allProducto() {
		
		return productoRepository.findAll();
	}

	@Override
	public void delete(Long id) {
	productoRepository.findById(id).
				orElseThrow(() -> new IllegalArgumentException("Invalid product Id: " + id));
	productoRepository.deleteById(id);
	}

	@Override
	public Producto edit(Producto producto, Producto editProducto) {
		
		System.out.println(producto.toString());
		System.out.println(editProducto.toString());
		
		producto.setNombre(editProducto.getNombre());
		producto.setDetalle(editProducto.getDetalle());
		producto.setCodigo(editProducto.getCodigo());
		producto.setPrecio(editProducto.getPrecio());
		producto.setStock(editProducto.getStock());
		
		return productoRepository.save(producto);
	}

}
