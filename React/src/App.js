import "./App.css";
import Navbar from "./components/Navbar";
import Footer from "./components/Footer";
import { BrowserRouter as Router, Routes, Route, Link } from "react-router-dom";
import Home from "./pages/home";
import Register from "./pages/register";
import Signin from "./pages/login";
import Quiz from "./pages/quiz";
import Add from "./pages/add";
import Code from "./pages/code";
import { ToastContainer } from "react-bootstrap";
import EndGame from "./pages/endGame";

function App() {
  return (
    <Router>
      <div>
        <Navbar />
        <Routes>
          <Route path="/" element={<Home />} />
          <Route path="/endGame/:points" element={<EndGame />} />
          <Route path="/quiz" element={<Quiz />} />
          <Route path="/add" element={<Add />} />
          <Route path="/signin" element={<Signin />} />
          <Route path="/signup" element={<Register />} />
          <Route path="/code" element={<Code />} />
        </Routes>
        <Footer />
      </div>
    </Router>
  );
}

export default App;
