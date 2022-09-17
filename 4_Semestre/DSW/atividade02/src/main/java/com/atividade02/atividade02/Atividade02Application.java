package com.atividade02.atividade02;

import java.time.LocalDate;
import java.util.List;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;

import com.atividade02.atividade02.curriculo.Curriculo;
import com.atividade02.atividade02.curriculo.Experiencia;
import com.atividade02.atividade02.curriculo.Formacao;
import com.atividade02.atividade02.curriculo.Idioma;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@SpringBootApplication
@RestController
public class Atividade02Application {

	public static void main(String[] args) {
		SpringApplication.run(Atividade02Application.class, args);
	}	

	@RequestMapping(value="/get-curriculo", method=RequestMethod.GET)
	public ResponseEntity<Curriculo> getCurriculo() {

		Curriculo cv = new Curriculo(
			"Matheus Cavalcanti de Arruda", 
			"manhattan@email.com", 
			"(11) 98989-7564", 
			LocalDate.of(1999, 6, 11), 
			"https://www.linkedin.com/in/matheus-cavalcantidearruda/",
			"https://www.github.com/oManhattan");

		List<String> conhecimentos = List.of("Java", "Swift");
		List<Experiencia> experiencias = List.of(
			new Experiencia("Apple Developer Academy", "Desenvolvedor iOS", LocalDate.of(2022, 02, 01), null)
		);
		List<Formacao> formacoes = List.of(
			new Formacao("Tecnólogo em Análise Desenvolvimento de Sistemas", "Centro Universitário Senac Santo Amaro")
		);
		List<Idioma> idiomas = List.of(
			new Idioma("Inglês", "bom", "bom", "bom"),
			new Idioma("Espanhol", "ruim", "ruim", "ruim")
		);

		cv.setConhecimentos(conhecimentos);
		cv.setExperiencias(experiencias);
		cv.setFormacoes(formacoes);
		cv.setIdiomas(idiomas);

		return new ResponseEntity<Curriculo>(cv, HttpStatus.ACCEPTED);
	}
}
