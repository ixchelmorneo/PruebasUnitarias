package com.uacm.edu.mx.controller;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.uacm.edu.mx.models.entity.Producto;
import com.uacm.edu.mx.models.service.IProductoService;

@Controller
@RequestMapping("/producto")
public class ProductoController {

	
   
	@Autowired
	private IProductoService productoService;
	
	
	
	@PostMapping("/registrarProducto")	
	private String recibePeticion(Map <String, Object> model, Producto producto) {
	
		
	        productoService.alta(
	        		producto.getNombreProducto(),
	        		producto.getCodIdent(),	        		
	        		producto.getPrecio(),
	        		producto.getStock(), 
	        		producto.getDetalleProducto());
	        
	        return "Productos";
	}
	
	
	@RequestMapping(method=RequestMethod.GET)
   private String buscarProductos(Map <String, Object> model ) {
		List<Producto> productosObtenidos = productoService.obtenerTodosProducto();
	   
	  
	   model.put("productos", productosObtenidos);
	    
	   return "inventario";
   }
    
	
}