import React from "react";
import "../assets/registration.css";
import { Link } from "react-router-dom";
import Popup from "reactjs-popup";
import { useNavigate } from "react-router-dom";
import { toast, ToastContainer } from "react-toastify";
import "react-toastify/dist/ReactToastify.css";
import { useState } from "react";
import axios from "axios";

function Code() {
  function postCode(event) {
    event.preventDefault();
    if (code !== "") {
      axios
        .post("http://localhost:8080/api/Code", { code })
        .then((response) => {
          console.log("działa");
          console.log(response);
          toast.error("Utworzono konto! ", {
            position: "bottom-right",
            autoClose: 5000,
            hideProgressBar: false,
            closeOnClick: true,
            pauseOnHover: true,
            draggable: true,
            progress: undefined,
            theme: "light",
          });
          setTimeout(() => {
            nav("/");
          }, 2000);
        })
        .catch((error) =>
          toast.error("Błędny kod! ", {
            position: "bottom-right",
            autoClose: 5000,
            hideProgressBar: false,
            closeOnClick: true,
            pauseOnHover: true,
            draggable: true,
            progress: undefined,
            theme: "light",
          })
        );
    } else {
      toast.error("Uzupełnij wszystkie pola! ", {
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
  const [code, setCode] = useState("");

  return (
    <form className="registration-form">
      <h1>Wpisz kod</h1>
      <div className="form-group">
        <label htmlFor="username">Kod:</label>
        <input
          type="number"
          id="kod"
          value={code}
          onChange={(e) => setCode(e.target.value)}
        />
      </div>
      <button type="submit" onClick={postCode}>
        Zarejestruj się
      </button>
      <button type="submit" onClick={() => nav("/signup")}>
        Wróć
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
    </form>
  );
}

export default Code;
