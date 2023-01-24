import "bootstrap/dist/css/bootstrap.min.css";
import "../assets/navbar.css";
import { Link, useLocation } from "react-router-dom";
import { React } from "react";
import { ToastContainer } from "react-toastify";
import { useNavigate } from "react-router-dom";

const Mynavbar = () => {
  const path = useLocation();
  const nav = useNavigate();

  let navbar;
  const currentPath = window.location.pathname;
  const isLogged = localStorage.getItem("isLogged");
  function logOut() {
    localStorage.removeItem("isLogged");
    nav("/");
  }
  if (path.pathname === "/") {
    console.log(window.location);
    navbar = (
      <header>
        <Link to="/">
          <div className="logo">
            <img src={require("../assets/logo.png")} alt="Logo" />
          </div>
        </Link>
        <nav className="left-actions">
          <Link to="/">
            <button>Home</button>
          </Link>
        </nav>
        <div className="right-actions">
          {isLogged && (
            <button href="#" onClick={logOut}>
              Wyloguj
            </button>
          )}
          {!isLogged && (
            <>
              <Link to="/signin">
                <button href="#">Login</button>
              </Link>
              <Link to="/signup">
                <button>Sign up</button>
              </Link>
            </>
          )}
        </div>
      </header>
    );
  } else if (currentPath === "/signin") {
    console.log(window.location);
    navbar = (
      <header>
        <Link to="/">
          <div className="logo">
            <img src={require("../assets/logo.png")} alt="Logo" />
          </div>
        </Link>
        <nav className="left-actions">
          <Link to="/">
            <button>Home</button>
          </Link>
        </nav>
        <div className="right-actions">
          {isLogged && (
            <button href="#" onClick={logOut}>
              Wyloguj
            </button>
          )}
          {!isLogged && (
            <Link to="/signup">
              <button>Sign up</button>
            </Link>
          )}
        </div>
      </header>
    );
  } else if (currentPath === "/signup") {
    console.log(window.location);
    navbar = (
      <header>
        <Link to="/">
          <div className="logo">
            <img src={require("../assets/logo.png")} alt="Logo" />
          </div>
        </Link>
        <nav className="left-actions">
          <Link to="/">
            <button>Home</button>
          </Link>
        </nav>
        <div className="right-actions">
          {isLogged && (
            <button href="#" onClick={logOut}>
              Wyloguj
            </button>
          )}
          {!isLogged && (
            <Link to="/signin">
              <button href="#">Login</button>
            </Link>
          )}
        </div>
      </header>
    );
  } else {
    console.log(window.location);
    navbar = (
      <header>
        <Link to="/">
          <div className="logo">
            <img src={require("../assets/logo.png")} alt="Logo" />
          </div>
        </Link>
        <nav className="left-actions">
          <Link to="/">
            <button>Home</button>
          </Link>
        </nav>
        <div className="right-actions">
          {isLogged && (
            <button href="#" onClick={logOut}>
              Wyloguj
            </button>
          )}
        </div>
      </header>
    );
  }
  return navbar;
};
//src={require('../assets/logo.png')}
export default Mynavbar;
