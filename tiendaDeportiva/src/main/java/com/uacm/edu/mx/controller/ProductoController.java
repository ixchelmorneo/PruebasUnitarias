package com.uacm.edu.mx.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
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
	public void addEmplployeeTomModel(Model model) {
		model.addAttribute("producto", new Producto());
	}

	@PostMapping()
	public String addStudent(@ModelAttribute("producto") Producto producto, BindingResult result, Model model) {
		if (result.hasErrors()) {
			return "error";
		}

		productoService.create(producto);

		return "redirect:producto";
	}

	@PostMapping("edit/{id}")
	public String updateStudent(@PathVariable("id") long id, Producto editProducto, BindingResult result, Model model) {
		if (result.hasErrors()) {
			editProducto.setId(id);
			return "error";
		}
		Producto producto = productoService.getById(id)
				.orElseThrow(() -> new IllegalArgumentException("Invalid student Id:" + id));
	
		productoService.edit(producto, editProducto);
		
		model.addAttribute("productos", productoService.allProducto());
		return "redirect:../producto";
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

	@GetMapping("edit/{id}")
	public String editProductView(@PathVariable("id") long id, Model model) {
		Producto producto = productoService.getById(id)
				.orElseThrow(() -> new IllegalArgumentException("Invalid student Id:" + id));

		model.addAttribute("producto", producto);
		return "vistas/producto/producto-edit";
	}

	@PostMapping("delete")
	public String deleteProducto(@RequestParam String id, Model model) {
		productoService.delete(Long.valueOf(id));

		model.addAttribute("productos", productoService.allProducto());
		return "redirect:../producto";
	}

}