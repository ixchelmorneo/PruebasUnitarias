package com.uacm.edu.mx.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.uacm.edu.mx.models.entity.Usuario;
import com.uacm.edu.mx.models.service.IAdministradorService;

@Controller
@RequestMapping("/vistas")
public class AdministradorController {

	
	@Autowired
	private IAdministradorService administradorService;

	@ModelAttribute
	public void addEmplployeeTomModel(Model model) {
		model.addAttribute("administrador", new Usuario());
	}

	

	

	@GetMapping()
	public String allProductos(@RequestParam(name = "name", required = false) String name, Model model) {

		model.addAttribute("productos", administradorService.allUsuario());
		return "vistas/producto/producto";
	}

	
	@PostMapping("delete")
	public String deleteProducto(@RequestParam String id, Model model) {
		administradorService.delete(Long.valueOf(id));

		model.addAttribute("usuario", administradorService.allUsuario());
		return "redirect:../usuario";
	}
	
	
	
	
}
