package com.example.Quiz_app.questions;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class QuestionService {
    private final QuestionRepository questionRepository;
    @Autowired
    public QuestionService(QuestionRepository questionRepository) {
        this.questionRepository = questionRepository;
    }


    public List<Questions> getQuestions(){
        return questionRepository.findAll();
    }
}
