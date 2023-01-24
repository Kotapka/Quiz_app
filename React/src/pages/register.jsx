import React from "react";
import "../assets/registration.css";
import { useState } from "react";
import axios from "axios";
import { useNavigate } from "react-router-dom";
import { toast, ToastContainer } from "react-toastify";
import "react-toastify/dist/ReactToastify.css";

function Register() {
  function postRegister(event) {
    event.preventDefault();
    if (login !== "" && email !== "" && password !== "") {
      axios
        .post("http://localhost:8080/apiRegister", { login, email, password })
        .then((response) => {
          console.log(response);
          nav("/code");
        })
        .catch((error) =>
          toast.error("Błędne dane! ", {
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
  const [login, setLogin] = useState("");
  const [email, setEmail] = useState("");
  const [password, setPassword] = useState("");

  return (
    <form className="registration-form">
      <h1>Rejestracja</h1>
      <div className="form-group">
        <label htmlFor="username">Login:</label>
        <input
          type="text"
          id="login"
          value={login}
          onChange={(e) => setLogin(e.target.value)}
        />
      </div>
      <div className="form-group">
        <label htmlFor="email">Adres e-mail:</label>
        <input
          type="email"
          id="email"
          value={email}
          onChange={(e) => setEmail(e.target.value)}
        />
      </div>
      <div className="form-group">
        <label htmlFor="password">Hasło:</label>
        <input
          type="password"
          id="password"
          value={password}
          onChange={(e) => setPassword(e.target.value)}
        />
      </div>
      <button type="submit" onClick={postRegister}>
        Wyślij kod
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

export default Register;
