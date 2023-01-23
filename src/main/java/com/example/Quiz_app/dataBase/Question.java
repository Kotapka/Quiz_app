package com.example.Quiz_app.dataBase;

import jakarta.persistence.*;

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

    private Integer id;
    private Integer testID;
    private String questionText;
    private String correctAnswer;
    private String wrongAnswer1;
    private String wrongAnswer2;
    private String wrongAnswer3;
    
    public Question(){}

    public Question(Integer id, Integer testID, String questionText, String correctAnswer, String wrongAnswer1,
                    String wrongAnswer2, String wrongAnswer3) {
        this.id = id;
        this.testID = testID;
        this.questionText = questionText;
        this.correctAnswer = correctAnswer;
        this.wrongAnswer1 = wrongAnswer1;
        this.wrongAnswer2 = wrongAnswer2;
        this.wrongAnswer3 = wrongAnswer3;
    }

    public Integer getId() {
        return id;
    }

    public Integer getTestID() {
        return testID;
    }

    public String getQuestionText() {
        return questionText;
    }

    public String getCorrectAnswer() {
        return correctAnswer;
    }

    public String getWrongAnswer1() {
        return wrongAnswer1;
    }

    public String getWrongAnswer2() {
        return wrongAnswer2;
    }

    public String getWrongAnswer3() {
        return wrongAnswer3;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public void setTestID(Integer testID) {
        this.testID = testID;
    }

    public void setQuestionText(String questionText) {
        this.questionText = questionText;
    }

    public void setCorrectAnswer(String correctAnswer) {
        this.correctAnswer = correctAnswer;
    }

    public void setWrongAnswer1(String wrongAnswer1) {
        this.wrongAnswer1 = wrongAnswer1;
    }

    public void setWrongAnswer2(String wrongAnswer2) {
        this.wrongAnswer2 = wrongAnswer2;
    }

    public void setWrongAnswer3(String wrongAnswer3) {
        this.wrongAnswer3 = wrongAnswer3;
    }
}
