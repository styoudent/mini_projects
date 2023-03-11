import calculator.Calculator;
import calculator_data.FixedVariables;

public class Main {
    public static void main(String[] args) {
        FixedVariables variables = new FixedVariables();
        Calculator calculator = new Calculator();
        calculator.add(variables.getFirstNum(), variables.getSecondNum());
    }
}