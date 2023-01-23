import React from "react";
import { Link, useNavigate } from "react-router-dom";
import axios from "axios";
import { useState } from "react";
import { Button } from "react-bootstrap";

function Signin() {
  function postLogin(event) {
    event.preventDefault();
    axios
      .post("http://localhost:8080/apiLogin", { login, password })
      .then((response) => {
        console.log(response);
        localStorage.setItem("isLogged", !!response.data);
        nav("/");
      })
      .catch((error) => console.log(error));
  }

  const nav = useNavigate();
  const [login, setLogin] = useState("");
  const [password, setPassword] = useState("");

  return (
    <form className="registration-form">
      <h1>Logowanie</h1>
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
        <label htmlFor="password">Hasło:</label>
        <input
          type="password"
          id="password"
          value={password}
          onChange={(e) => setPassword(e.target.value)}
        />
      </div>
      <button type="submit" onClick={postLogin}>
        Zaloguj się
      </button>
    </form>
  );
}

export default Signin;
