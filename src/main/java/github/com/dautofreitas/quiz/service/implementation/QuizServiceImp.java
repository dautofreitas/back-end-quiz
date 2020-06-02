package github.com.dautofreitas.quiz.service.implementation;

import java.util.stream.Collectors;

import org.springframework.stereotype.Service;

import github.com.dautofreitas.quiz.domain.entity.Questao;
import github.com.dautofreitas.quiz.domain.entity.Quiz;
import github.com.dautofreitas.quiz.domain.entity.Resposta;
import github.com.dautofreitas.quiz.domain.repository.QuizRepository;
import github.com.dautofreitas.quiz.rest.dto.QuizDTO;
import github.com.dautofreitas.quiz.service.QuizService;
@Service
public class QuizServiceImp implements QuizService {
	private QuizRepository quizRepository;
	
	public QuizServiceImp(QuizRepository quizRepository) {
		this.quizRepository = quizRepository;
	}

	public void Save(QuizDTO quizDTO) {
		this.quizRepository.save(convertQuizDtoToQuizDoman(quizDTO));
	}

	private Quiz convertQuizDtoToQuizDoman(QuizDTO quizDTO) {

		Quiz quiz = new Quiz();

		quiz.setId(quizDTO.getId());
		quiz.setNome(quizDTO.getNome());
		
		quiz.setQuestoes(quizDTO.getQuestoes().stream().map(dto -> {
			Questao questao = new Questao();
			questao.setId(dto.getId());
			questao.setPergunta(dto.getPergunta());
			questao.setQuantidadeSelecaoResposta(dto.getQuantidadeSelecaoResposta());
			questao.setRespostas(dto.getRespostas().stream().map(dtoResp -> {
				Resposta resposta = new Resposta();
				resposta.setId(dtoResp.getId());
				resposta.setCorreta(dtoResp.getCorreta());
				resposta.setSelecionada(dtoResp.getSelecionada());
				resposta.setTitulo(dtoResp.getTitulo());				
				return resposta;
			}).collect(Collectors.toList()));
			return questao;
		}).collect(Collectors.toList()));

		return quiz;

	}
}
