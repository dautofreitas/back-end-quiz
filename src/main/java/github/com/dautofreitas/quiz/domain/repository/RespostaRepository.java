package github.com.dautofreitas.quiz.domain.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import github.com.dautofreitas.quiz.domain.entity.Resposta;

public interface RespostaRepository extends JpaRepository<Resposta, Integer>  {

}
