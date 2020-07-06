package br.com.tokiomarine.seguradora.avaliacao.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import br.com.tokiomarine.seguradora.avaliacao.service.EstudanteServiceImpl;

@Controller
public class RedirectController {

	@Autowired
	EstudanteServiceImpl service;
	
	@GetMapping("/")
	public String initialPage(Model model) {
		model.addAttribute("estudantes", service.buscarEstudantes());
		return "index";
	}
	
}
