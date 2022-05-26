package com.generation.helloword.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/hello")
public class HelloController {
	
	@GetMapping
	public String helloWord() {
		return "Hello World!!!";
	}
	
	@GetMapping("/bsm")
	public String bsm() {
		return "<b>BSM - Habilidades:</b> <br /> Atenção aos detalhes.";
	}
	
	@GetMapping("/objetivo")
	public String objetivo() {
		return "<b>Meus objetivos de estudo da semana são:</b> <br /> -Revisar as máterias passadas de java;"
				+ "<br /> -Terminar alguns exercícios para fixação do MySQL; <br /> -Revisar Lógica de programação;"
				+ "<br /> -Fazer exercícios para treinar lógica; <br /> -Estudar Inglês. ";
	}

}
