import React from "react";
import { Button } from "react-bootstrap";
import { useParams } from "react-router-dom";
import "../assets/quiz.css";
import { useEffect, useState } from "react";
import axios from "axios";
import { useNavigate } from "react-router-dom";
import { shuffle } from "lodash";

function Quiz() {
  const [answers, setAnswers] = useState([]);
  const [questions, setQuestions] = useState([]);
  const [points, setPoints] = useState(0);
  const [questionNumber, setQuestionNumber] = useState(0);
  const [ready, setReady] = useState(false);
  const nav = useNavigate();

  const getTitle = () => {
    axios.get("http://localhost:8080/Quizzes").then((response) => {
      console.log(response);
      setQuestions(response.data);
      const sh = [
        response.data[0].r_a,
        response.data[0].w_a1,
        response.data[0].w_a2,
        response.data[0].w_a3,
      ];
      setAnswers(shuffle(sh));
      setReady(true);
    });
  };

  useEffect(() => {
    getTitle();
  }, []);

  function nextQuestion(answer) {
    if (answer === questions[questionNumber].r_a) {
      setPoints(() => points + 1);
    }
    if (questions.length - 1 === questionNumber) {
      console.log(points);
      nav(`/endGame/${points}`);
    } else {
      setQuestionNumber(() => questionNumber + 1);
      const sh = [
        questions[questionNumber + 1].r_a,
        questions[questionNumber + 1].w_a1,
        questions[questionNumber + 1].w_a2,
        questions[questionNumber + 1].w_a3,
      ];
      setAnswers(shuffle(sh));
    }
  }

  return (
    <div>
      {ready && (
        <div className="question">
          <span className="counter">
            {points}/{questions.length}
          </span>
          <div className="questionText">
            <h1>{questions[questionNumber].question}</h1>
          </div>
          <div className="answers">
            <button className="answer" onClick={() => nextQuestion(answers[0])}>
              {answers[0]}
            </button>
            <button className="answer" onClick={() => nextQuestion(answers[1])}>
              {answers[1]}
            </button>
            <button className="answer" onClick={() => nextQuestion(answers[2])}>
              {answers[2]}
            </button>
            <button className="answer" onClick={() => nextQuestion(answers[3])}>
              {answers[3]}
            </button>
          </div>
        </div>
      )}
    </div>
  );
}

export default Quiz;
