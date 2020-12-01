package com.uacm.edu.mx.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.uacm.edu.mx.models.entity.Usuario;
import com.uacm.edu.mx.models.service.IUsuarioService;

@Controller
@RequestMapping("/vistas")
public class UsuarioController {

	@Autowired
	private IUsuarioService usuarioService;
	
	@ModelAttribute
	public void addEmplployeeTomModel(Model model) {
		model.addAttribute("usuario", new Usuario());
	}
	
	
	
	@PostMapping()
	public String addStudent(@ModelAttribute("usuario") Usuario usuario, BindingResult result, Model model) {
		if (result.hasErrors()) {
			return "error";
		}

		usuarioService.create(usuario);

		return "redirect:usuario";
	}


	@GetMapping("/home")
	public String createUsuarioView() {

		return "vistas/home";
	}

	


	
	
	
	
	
	
	
	
	
	
}
