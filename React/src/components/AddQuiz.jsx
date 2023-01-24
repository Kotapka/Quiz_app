import React from "react";
import Button from "react-bootstrap/Button";
import Card from "react-bootstrap/Card";
import "bootstrap/dist/css/bootstrap.min.css";
import Box from "@mui/material/Box";
import { Link } from "react-router-dom";

const AddQuiz = () => {
  const [value, setValue] = React.useState(0);
  const [hover, setHover] = React.useState(-1);
  return (
    <div className="card">
      <img
        style={{ width: 150, height: 150, margin: 65 }}
        className="card-img-top"
        src={require("../assets/plus.jpg")}
        alt="Card image cap"
      ></img>
    </div>
  );
};

export default AddQuiz;
