package com.uacm.edu.mx.controller;

import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.uacm.edu.mx.models.service.IAdministradorService;


@Controller
@RequestMapping("/adminVista")
public class AdministradorController {

	
	
	public IAdministradorService administradorService;
	

	
	@GetMapping("/usuariosList")
	private String buscarModelos(Map <String, Object> model) {
		
       
		
        //List <Administador> usuariosObtenidos =  Lists.newArrayList(administradorService.findAll());
        
       
        
	//	model.put("clientes",usuariosObtenidos);
		
		return "mostrar"; 
	}
	
	
	@GetMapping("/eliminar")
	private String Cancelar() {
		
 
       // log.debug("Entrando al metodo Cancelar");
        
		
		return "login"; 
	}
	
	
	
}
