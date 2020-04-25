package br.com.leonardosm.academico.aula01;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.leonardosm.academico.aula01.repositorios.CursoRepository;

@RestController
public class Curso {
	private CursoRepository cursoRepository;
	
	@RequestMapping("/curso")
	public String curso() {
		return "Curso";
	}
	
	@RequestMapping("/lista")
	public Iterable<br.com.leonardosm.academico.aula01.entidades.Curso> listar() {
		return cursoRepository.findAll();
	}
}
