package test;

import calculator.Calculator;

import org.junit.jupiter.api.Test;

import static org.testng.Assert.assertEquals;


class CalculatorTest {
    @Test
    void ThreePlusFiveShouldEqualEight(){
        Calculator calculator = new Calculator();
        assertEquals(8, calculator.add(3,5));
    }
    @Test
      void TwoPlusTwoShouldEqualFour() {
        Calculator calculator = new Calculator();
        assertEquals(4, calculator.add(2,2));
    }
}