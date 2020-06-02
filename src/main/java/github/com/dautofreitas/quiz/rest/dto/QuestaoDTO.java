package github.com.dautofreitas.quiz.rest.dto;

import java.util.List;

public class QuestaoDTO {	
	private Integer id;
	private List<RespostaDTO> respostas;
	private String pergunta;
	private Integer quantidadeSelecaoResposta;
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public List<RespostaDTO> getRespostas() {
		return respostas;
	}
	public void setRespostas(List<RespostaDTO> respostas) {
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
