import Axios from "axios";
import React, { useEffect, useState } from "react";
import { Button } from "react-bootstrap";
import AddQuiz from "../components/AddQuiz";
import FilmCard from "../components/FilmCard";

function Home() {
  const getTitle = () => {
    Axios.get("http://localhost:8080/Quizzes").then((response) => {
      console.log(response);
      setQuizzes(response.data.quizList);
      setReady(true);
    });
  };

  const [quizzes, setQuizzes] = useState([]);
  useEffect(() => {
    getTitle();
  }, []);

  const [ready, setReady] = useState(false);

  return (
    <div className="myrow">
      {ready && (
        <>
          {quizzes.map((quiz, index) => {
            return <FilmCard key={index} title={quiz.title} />;
          })}
        </>
      )}
    </div>
  );
}
export default Home;
