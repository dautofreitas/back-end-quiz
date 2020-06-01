package github.com.dautofreitas.quiz.domain.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import github.com.dautofreitas.quiz.domain.entity.Quiz;

public interface QuizRepository extends JpaRepository<Quiz, Integer> {

}
