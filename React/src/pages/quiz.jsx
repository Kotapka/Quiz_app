import React from "react";
import { Button } from "react-bootstrap";
import "../assets/quiz.css";

function Quiz() {
  return (
    <div>
      <div className="question">
        <div className="questionText">
          <h1>Pytanie</h1>
        </div>
        <div className="answers">
          <Button className="answer">Test1</Button>
          <Button className="answer">Test2</Button>
          <Button className="answer">Test3</Button>
          <Button className="answer">Test4</Button>
        </div>
      </div>
    </div>
  );
}

export default Quiz;
