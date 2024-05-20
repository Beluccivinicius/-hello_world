package com.generation.helloWord2.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/ola-mundo")
public class HelloWord {

		@GetMapping
		public String ola() {
			return "olá mundo";
		}
		
		@GetMapping("bsm-generation")
		public String bsmGeneration() {
			return "Competencias comportamentais:\n"
					+ "\n"
					+ "Comunicação\n"
					+ "Proatividade\n"
					+ "Orientação ao detalhe\n"
					+ "Trabalho em equipe\n"
					+ "\n"
					+ "Mentalidades:\n"
					+ "\n"
					+ "Responsabilidade Pessoal\n"
					+ "Mentalidade de Crescimento\n"
					+ "Orientação ao Futuro\n"
					+ "Persistencia";
		}
		
		@GetMapping("objetivos-pessoais")
		public String objetivosPessoais() {
			return "Nessa semana estou realmente comprometido com melhorar minha soft skill de comunicação\n"
					+ "e de hard skill o entendimento melhor de SQL, acho que é um tema que precisa ser treinado mais\n"
					+ "algumas vezes para poder fixar";
		}
		
		
		
		public static void main(String[] args) {
			// TODO Auto-generated method stub

		}

	}
