package github.com.dautofreitas.quiz.domain.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import github.com.dautofreitas.quiz.domain.entity.Questao;

public interface QuestaoRepository extends JpaRepository<Questao, Integer > {

}
