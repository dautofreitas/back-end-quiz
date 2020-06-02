package github.com.dautofreitas.quiz.rest.dto;

import java.util.List;

public class QuizDTO {
	private Integer id;
	private String nome;
	private List<QuestaoDTO> questoes;
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public List<QuestaoDTO> getQuestoes() {
		return questoes;
	}
	public void setQuestoes(List<QuestaoDTO> questoes) {
		this.questoes = questoes;
	}
	
}
