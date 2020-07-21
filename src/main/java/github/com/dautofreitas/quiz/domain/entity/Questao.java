package github.com.dautofreitas.quiz.domain.entity;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

import lombok.Data;

@Entity
@Data
public class Questao {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer id;
	@ManyToOne
	@JoinColumn(name = "quiz_id")
	private Quiz quiz;	
	@OneToMany(mappedBy = "questao",fetch = FetchType.LAZY,cascade = CascadeType.MERGE)
	private List<Resposta> respostas;
	private String pergunta;
	private Integer quantidadeSelecaoResposta;	
}
