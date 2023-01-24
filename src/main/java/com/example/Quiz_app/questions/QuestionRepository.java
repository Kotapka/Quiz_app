package com.example.Quiz_app.questions;

import com.example.Quiz_app.questions.Questions;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Collection;

@Repository
public interface QuestionRepository extends JpaRepository<Questions,Integer> {
}
