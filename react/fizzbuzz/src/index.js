import React from "react";
import ReactDOM from "react-dom/client";
import "./index.css";
import App from "./App";
import reportWebVitals from "./reportWebVitals";
import "./FizzBuzz";
import FizzBuzz from "./FizzBuzz";

const generateFizzBuzz = () => {
  const numbers = [];
  for (let i = 1; i <= 100; i++) {
    if (i % 3 === 0 && i % 5 === 0) {
      numbers.push("FizzBuzz");
    } else if (i % 3 === 0) {
      numbers.push("Fizz");
    } else if (i % 5 === 0) {
      numbers.push("Buzz");
    } else {
      numbers.push(i);
    }
  }
  console.log(numbers);
};

generateFizzBuzz();

const root = ReactDOM.createRoot(document.getElementById("root"));
root.render(
  <React.StrictMode>
    <FizzBuzz />
  </React.StrictMode>
);

// If you want to start measuring performance in your app, pass a function
// to log results (for example: reportWebVitals(console.log))
// or send to an analytics endpoint. Learn more: https://bit.ly/CRA-vitals
reportWebVitals();
