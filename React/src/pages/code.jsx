import React from "react";
import "../assets/registration.css";
import { Link } from "react-router-dom";
import Popup from "reactjs-popup";

function Code() {
  return (
    <form className="registration-form">
      <h1>Wpisz kod</h1>
      <div className="form-group">
        <label htmlFor="username">Kod:</label>
        <input type="text" id="kod" />
      </div>
      <button type="submit">Zarejestruj się</button>
      <Link to="/signup">
        <button type="submit">Wróć</button>
      </Link>
    </form>
  );
}

export default Code;
