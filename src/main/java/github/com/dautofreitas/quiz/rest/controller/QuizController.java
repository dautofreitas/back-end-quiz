package github.com.dautofreitas.quiz.rest.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import github.com.dautofreitas.quiz.rest.dto.QuizDTO;
import github.com.dautofreitas.quiz.service.QuizService;



@RestController
@RequestMapping("quiz")
public class QuizController {
	
	QuizService quizService; 
	
	
	public QuizController(QuizService quizRepository) {
		
		this.quizService = quizRepository;
	}


	@GetMapping("hello")
	public String hello()
	{
		return "Hello test DEV tools mudança";
	}
	
	@PostMapping
	public QuizDTO save(@RequestBody QuizDTO quizDTO )
	{
		quizService.Save(quizDTO);
		
		return quizDTO;
	}
	
}
