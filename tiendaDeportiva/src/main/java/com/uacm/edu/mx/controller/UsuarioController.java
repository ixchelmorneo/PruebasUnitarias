package com.uacm.edu.mx.controller;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.uacm.edu.mx.models.entity.Usuario;
import com.uacm.edu.mx.models.service.IUsuarioService;

@Controller
@RequestMapping("/vistas")
public class UsuarioController {

	@Autowired
	private IUsuarioService usuarioService;
	
	//private UsuarioRepository usuarioRepository;
	
	/*
	@GetMapping("/")
	public String index() {
		return "home";
	}*/
	
	
	@PostMapping("/home")
	public String crear(Map <String, Object> model, Usuario usuario) {
	//private String recibePeticion(Map
		usuarioService.alta(usuario.getNombre(),usuario.getApellidoP(),usuario.getApellidoM(),usuario.getEdad(),
				usuario.getTelefono(),usuario.getDireccion(),usuario.getEmail(),usuario.getPassword());
		
		
		/*
		Usuario usuario = new Usuario();
		
		model.addAttribute("titulo", "Formulario: Nuevo Usuario");
		model.addAttribute("usuario", usuario);
		
		*/
		return "home";
	}
	
	
	
	
	
	
}