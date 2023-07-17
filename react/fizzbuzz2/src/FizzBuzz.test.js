import React from "react";
import { render } from "@testing-library/react";
import FizzBuzz from "./FizzBuzz";

describe("FizzBuzz Component", () => {
  it("should render FizzBuzz numbers correctly", () => {
    render(<FizzBuzz />);

    // Effectuez des assertions pour vérifier le rendu attendu
    const fizzBuzzNumbers = screen.getAllByText(/Fizz|Buzz|FizzBuzz|\d+/);
    expect(fizzBuzzNumbers.length).toBe(100);
  });
});
