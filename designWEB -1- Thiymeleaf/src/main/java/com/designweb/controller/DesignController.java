package com.designweb.controller;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;



@Controller
public class DesignController {


	
	//@SuppressWarnings("unchecked")
	@GetMapping("/greeting")
	public String greeting(@RequestParam(name="name", required=false, defaultValue="World") String name, Model model) {
		
		/*
		//LOGICA DE ACCESO A DATOS DAO
		Persona p = new Persona();
		p.setIdpersona(1);
		p.setNombre("Abraham");
		repo.save(p);
		*/
		
		model.addAttribute("name", name);
		return "greeting";
	}	
	
}
