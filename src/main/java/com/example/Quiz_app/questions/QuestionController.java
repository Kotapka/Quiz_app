package com.example.Quiz_app.questions;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * Class containing information about used service.
 */
@RestController
@RequestMapping(path = "/Quizzes")
public class QuestionController {
    private final QuestionService questionService;

    /**
     * Constructor.
     * @param questionService - service being used.
     */
    @Autowired
    public QuestionController(QuestionService questionService) {
        this.questionService = questionService;
    }

    /**
     * Function returning Questions class object.
     * @return - Questions class object from questions' service.
     */
    @GetMapping
    public List<Questions> getUser(){
        return questionService.getQuestions();
    }
}
