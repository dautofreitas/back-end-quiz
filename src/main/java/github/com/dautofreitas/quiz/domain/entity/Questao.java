package github.com.dautofreitas.quiz.domain.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity(name = "Questao")
public class Questao {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	Integer id;
}