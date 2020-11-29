package com.uacm.edu.mx.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.uacm.edu.mx.models.entity.Producto;
import com.uacm.edu.mx.models.service.IProductoService;

@Controller
@RequestMapping("/producto")
public class ProductoController {

	@Autowired
	private IProductoService productoService;
	
	@ModelAttribute
	public void addEmplployeeTomModel(Model model){
	     model.addAttribute("producto",new Producto());
	}
	
	@PostMapping()
	public String addStudent(@ModelAttribute("producto") Producto producto, BindingResult result, Model model) {
		if (result.hasErrors()) {
			return "error";
		}

		System.out.println(producto.toString());
		productoService.create(producto);
		
        return "redirect:producto";
	}

	@GetMapping()
	public String allProductos(@RequestParam(name = "name", required = false) String name, Model model) {

		model.addAttribute("productos", productoService.allProducto());
		return "vistas/producto/producto";
	}

	@GetMapping("/create")
	public String createProductView() {

		return "vistas/producto/producto-create";
	}

//	@RequestMapping(method = RequestMethod.GET)
//	private String buscarProductos(Map<String, Object> model) {
//		List<Producto> productosObtenidos = productoService.obtenerTodosProducto();
//
//		model.put("productos", productosObtenidos);
//
//		return "inventario";
//	}

}