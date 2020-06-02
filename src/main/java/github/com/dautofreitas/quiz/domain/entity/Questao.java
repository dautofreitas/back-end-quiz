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

@Entity
public class Questao {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer id;
	@ManyToOne
	@JoinColumn(name = "quiz_id")
	private Quiz quiz;	
	@OneToMany(mappedBy = "questao",fetch = FetchType.LAZY,cascade = CascadeType.PERSIST)
	private List<Resposta> respostas;
	private String pergunta;
	private Integer quantidadeSelecaoResposta;
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public Quiz getQuiz() {
		return quiz;
	}
	public void setQuiz(Quiz quiz) {
		this.quiz = quiz;
	}
	public List<Resposta> getRespostas() {
		return respostas;
	}
	public void setRespostas(List<Resposta> respostas) {
		this.respostas = respostas;
	}
	public String getPergunta() {
		return pergunta;
	}
	public void setPergunta(String pergunta) {
		this.pergunta = pergunta;
	}
	public Integer getQuantidadeSelecaoResposta() {
		return quantidadeSelecaoResposta;
	}
	public void setQuantidadeSelecaoResposta(Integer quantidadeSelecaoResposta) {
		this.quantidadeSelecaoResposta = quantidadeSelecaoResposta;
	}
}
