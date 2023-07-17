import React from "react";

class FizzBuzz extends React.Component {
  constructor(props) {
    super(props);
    this.state = {
      numbers: [],
    };
  }

  componentDidMount() {
    this.generateFizzBuzz();
  }

  generateFizzBuzz() {
    const numbers = [];
    for (let i = 1; i <= 100; i++) {
      let sortie = "";
      let nombre = i.toString();

      if (i === 33) {
        sortie += "FizzFizz";
      } else if (i === 55) {
        sortie += "BuzzBuzz";
      } else if (nombre.includes("3")) {
        sortie += "Fizz";
      } else if (nombre.includes("5")) {
        sortie += "Buzz";
      }

      if (i % 3 === 0 && i % 5 === 0) {
        sortie += "FizzBuzz";
      } else if (i % 3 === 0) {
        sortie += "Fizz";
      } else if (i % 5 === 0) {
        sortie += "Buzz";
      } else {
        sortie = i.toString();
      }

      numbers.push(sortie);
    }
    this.setState({ numbers });
  }

  render() {
    return (
      <div>
        {this.state.numbers.map((number, index) => (
          <div key={index}>{number}</div>
        ))}
      </div>
    );
  }
}

export default FizzBuzz;
