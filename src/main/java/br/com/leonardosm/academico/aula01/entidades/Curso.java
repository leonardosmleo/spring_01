package br.com.leonardosm.academico.aula01.entidades;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Curso {

	@Id
	private Integer id;
	
	private String nome;
}
