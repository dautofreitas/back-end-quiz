package github.com.dautofreitas.quiz.domain.entity;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

@Entity
public class Questao {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	Integer id;
	@ManyToOne
	@JoinColumn(name = "quiz_id")
	Quiz quiz;	
	@OneToMany(mappedBy = "questao",fetch = FetchType.LAZY)
	List<Resposta> respostas;
	String pergunta;
	Integer quantidadeSelecaoResposta;
}
