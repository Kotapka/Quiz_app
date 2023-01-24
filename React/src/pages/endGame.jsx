import Axios from "axios";
import React, { useEffect, useState } from "react";
import { useNavigate, useParams } from "react-router-dom";
import { toast, ToastContainer } from "react-toastify";
import "react-toastify/dist/ReactToastify.css";

function EndGame() {
  const nav = useNavigate();
  const { points } = useParams();
  function goToEnd() {
    nav("/");
  }

  return (
    <div className="myrow column">
      <div className="result-points">Udało Ci się zdobyć : {points} pkt</div>
      <button className="start-quiz-button" onClick={() => goToEnd()}>
        Powrót na strone główną
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

export default EndGame;
