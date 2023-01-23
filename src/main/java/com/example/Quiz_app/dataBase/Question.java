package com.example.Quiz_app.dataBase;

import jakarta.persistence.*;

import java.util.List;

@Entity
public class Question {

    @Id
    @SequenceGenerator(
            name = "question_id_sequence",
            sequenceName = "question_id_sequence"
    )
    @GeneratedValue(
            strategy = GenerationType.SEQUENCE,
            generator = "question_id_sequence"
    )

    private Integer questionID;
    private String questionText;
    private List<String> answers;

    public Question(){}

    public Question(Integer questionID, String questionText, String correctAnswer, String wrongAnswer1,
                    String wrongAnswer2, String wrongAnswer3){
        this.questionID = questionID;
        this.questionText = questionText;
        this.answers.add(correctAnswer);
        this.answers.add(wrongAnswer1);
        this.answers.add(wrongAnswer2);
        this.answers.add(wrongAnswer3);
    }
}
