package com.example.Quiz_app;

import com.example.Quiz_app.dataBase.Repository;
import com.example.Quiz_app.dataBase.Test;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@SpringBootApplication
@RestController
@RequestMapping("api/v1/questions")
public class QuizAppApplication {

	private final Repository repository;

	public QuizAppApplication(Repository repository) {
		this.repository = repository;
	}

	public static void main(String[] args) {
		SpringApplication.run(QuizAppApplication.class, args);
	}

	@GetMapping
	public List<Test> getQuestions(){
		return repository.findAll();
	}

}
