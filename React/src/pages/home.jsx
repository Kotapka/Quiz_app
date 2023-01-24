import Axios from "axios";
import React, { useEffect, useState } from "react";
import { useNavigate } from "react-router-dom";
import { toast, ToastContainer } from "react-toastify";
import "react-toastify/dist/ReactToastify.css";

function Home() {
  function isLogged() {
    const isLogged = localStorage.getItem("isLogged");
    if (isLogged) {
      nav("/quiz");
    } else {
      toast.error("Aby rozwiązać quiz musisz się zalogować! ", {
        position: "bottom-right",
        autoClose: 5000,
        hideProgressBar: false,
        closeOnClick: true,
        pauseOnHover: true,
        draggable: true,
        progress: undefined,
        theme: "light",
      });
    }
  }
  const nav = useNavigate();

  return (
    <div className="myrow">
      <button className="start-quiz-button" onClick={isLogged}>
        Rozwiąż Quiz
      </button>
      <ToastContainer
        position="bottom-right"
        autoClose={5000}
        hideProgressBar={false}
        newestOnTop={false}
        closeOnClick
        rtl={false}
        pauseOnFocusLoss
        draggable
        pauseOnHover
        theme="light"
      />
    </div>
  );
}
export default Home;
