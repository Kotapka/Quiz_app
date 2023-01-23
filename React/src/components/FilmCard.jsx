import React from "react";
import Button from "react-bootstrap/Button";
import Card from "react-bootstrap/Card";
import "bootstrap/dist/css/bootstrap.min.css";
import Box from "@mui/material/Box";
import { Link } from "react-router-dom";

const Myfilmcard = (props) => {
  const [value, setValue] = React.useState(0);
  const [hover, setHover] = React.useState(-1);

  return (
    <div className="card">
      <Link to="/quiz">
        <img
          className="card-img-top"
          src={require("../assets/logo.png")}
          alt="Card image cap"
        ></img>
      </Link>
      <div className="card-body">
        <Box
          sx={{
            "& > legend": { mt: 2 },
          }}
        ></Box>
        <h5 className="card-title">{props.title}</h5>
        <Link to="/quiz">
          <p className="card-text">Edytuj</p>
        </Link>
      </div>
    </div>
  );
};

export default Myfilmcard;
