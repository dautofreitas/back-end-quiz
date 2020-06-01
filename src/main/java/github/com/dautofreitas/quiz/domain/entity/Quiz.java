package github.com.dautofreitas.quiz.domain.entity;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity(name = "Quiz")
public class Quiz {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	Integer id;
	@OneToMany(mappedBy = "quiz", fetch = FetchType.LAZY)
	List<Questao> questoes;	
	String nome;
}
