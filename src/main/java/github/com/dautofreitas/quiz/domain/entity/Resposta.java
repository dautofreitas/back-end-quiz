package github.com.dautofreitas.quiz.domain.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="Resposta")
public class Resposta {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer id;
	
	@ManyToOne()
	@JoinColumn(name = "questao_id")
	Questao questao;
	
	private String titulo;
	
	private boolean correta;
	
	private boolean selecionada;
	
	
}
