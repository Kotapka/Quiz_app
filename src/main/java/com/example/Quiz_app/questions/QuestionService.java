package com.example.Quiz_app.questions;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Class responsible for access to repository.
 */
@Service
public class QuestionService {
    private final QuestionRepository questionRepository;

    /**
     * Constructor.
     * @param questionRepository - chosen repository.
     */
    @Autowired
    public QuestionService(QuestionRepository questionRepository) {
        this.questionRepository = questionRepository;
    }

    /**
     * Method returning all items found in repository.
     * @return all items from repository.
     */
    public List<Questions> getQuestions(){
        return questionRepository.findAll();
    }
}
