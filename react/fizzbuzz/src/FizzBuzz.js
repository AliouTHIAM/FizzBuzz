import React from "react";

class FizzBuzz extends React.Component {
  constructor() {
    super();
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
