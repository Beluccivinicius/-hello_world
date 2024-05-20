package com.generation.helloWord2;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


//@GetMapping
//public String ola() {
//	return "Olá mundo! Bom dia!";
//}
//@GetMapping("comidas")
//public String comidasFavoritas() {
//	return "sushi \nHamburguer";
//}
//@GetMapping("livros")
//public String livrosFavoritos() {
//	return "Eragon \nSenhor dos Aneis";
//}
//tem menu de contexto

@RestController
@RequestMapping("/ola-mundo")
public class HelloWord {

	@GetMapping
	public String ola() {
		return "olá mundo";
	}
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
