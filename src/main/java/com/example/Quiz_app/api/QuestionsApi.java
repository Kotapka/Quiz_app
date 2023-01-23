package com.example.Quiz_app.api;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class QuestionsApi {
    @GetMapping("/Questions")
    public QuizQuestions greet() {
        QuizQuestions response = new QuizQuestions(List.of(quiz1,quiz2));
        return response;
    }
    QnA questions = new QnA("Pytanie 1","A1","A2","A3","A4");
    QnA questions2 = new QnA("Pytanie 2","B1","B2","B3","B4");
    Quiz quiz1 = new Quiz(1,"Tytuł1",List.of(questions,questions2));
    Quiz quiz2 = new Quiz(2,"Tytuł2",List.of(questions2,questions));
    record QuizQuestions(List<Quiz> quizList){}
    record Quiz(int id,String title,List<QnA> qanList){}
    record QnA(String question,String r_a,String w_a1,String w_a2,String w_a3){}

   /* record Questions(String question,List<String> answers){}
    record Quiz(int id,String title,Questions question){}

    Questions questions = new Questions("Pytanie1",List.of("A1","A2","A3","A4"));
    Questions questions2 = new Questions("Pytanie2",List.of("B1","B2","B3","B4"));

    Quiz quiz1 = new Quiz(1,"Quiz1",questions);
    Quiz quiz2 = new Quiz(2,"Quiz2",questions2);
    record QuizQuestions(List<Quiz> Quiz){}*/
}
