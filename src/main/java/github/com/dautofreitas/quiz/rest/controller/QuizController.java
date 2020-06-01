package github.com.dautofreitas.quiz.rest.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class QuizController {
	
	@GetMapping("hello")
	public String hello()
	{
		return "Hello test DEV tools";
	}
}
