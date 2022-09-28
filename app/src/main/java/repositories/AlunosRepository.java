package biancabrandao.repositories;

import org.springframework.data.repository.CrudRepository;

import biancabrandao.models.Aluno;

public interface AlunosRepository extends CrudRepository<Aluno, Integer> {
    
}