package br.com.leonardosm.academico.aula01.repositorios;
import br.com.leonardosm.academico.aula01.entidades.*;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CursoRepository extends CrudRepository<Curso, String>{

}
