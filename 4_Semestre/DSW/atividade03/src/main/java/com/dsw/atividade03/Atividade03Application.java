package com.dsw.atividade03;

import java.time.LocalDate;
import java.util.List;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

import com.dsw.atividade03.curriculo.Curriculo;
import com.dsw.atividade03.curriculo.Experiencia;
import com.dsw.atividade03.curriculo.Formacao;
import com.dsw.atividade03.curriculo.Idioma;

@SpringBootApplication
@Controller
public class Atividade03Application {

	public static void main(String[] args) {
		SpringApplication.run(Atividade03Application.class, args);
	}

	@GetMapping()
	public ModelAndView getCurriculo() {

		ModelAndView mv = new ModelAndView("curriculo");
		Curriculo cv = construirCurriculo();

		mv.addObject("cv", cv);

		return mv;
	}

	private Curriculo construirCurriculo() {
		Curriculo cv = new Curriculo(
				"Matheus Cavalcanti de Arruda",
				"manhattan@email.com",
				"(11) 98989-7564",
				LocalDate.of(1999, 6, 11),
				"https://www.linkedin.com/in/matheus-cavalcantidearruda/",
				"https://www.github.com/oManhattan");

		List<String> conhecimentos = List.of("Java", "Swift");
		List<Experiencia> experiencias = List.of(
				new Experiencia("Apple Developer Academy", "Desenvolvedor iOS", LocalDate.of(2022, 02, 01), null));
		List<Formacao> formacoes = List.of(
				new Formacao("Tecnólogo em Análise Desenvolvimento de Sistemas",
						"Centro Universitário Senac Santo Amaro"));
		List<Idioma> idiomas = List.of(
				new Idioma("Inglês", "bom", "bom", "bom"),
				new Idioma("Espanhol", "ruim", "ruim", "ruim"));

		cv.setConhecimentos(conhecimentos);
		cv.setExperienciasProfissionais(experiencias);
		cv.setFormacaoAcademica(formacoes);
		cv.setIdiomas(idiomas);

		return cv;
	}
}
