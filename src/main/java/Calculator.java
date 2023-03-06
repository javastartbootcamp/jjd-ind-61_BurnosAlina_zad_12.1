public class Calculator {

    private double calculate(double number1, double number2, String mathSymbol) {
        double result = 0;
        switch (mathSymbol) {
            case "+":
                result = number1 + number2;
                break;
            case "-":
                result = number1 - number2;
                break;
            case "*":
                result = number1 * number2;
                break;
            case "/":
                result = number1 / number2;
                break;
            default:
                return 0;
        }
        System.out.println(number1 + " " + mathSymbol + " " + number2 + " = " + result);
        return result;
    }

    Result[] calculateAndPrint(MathOperation[] mathOperations) {
        double result = 0;
        Result[] results = new Result[mathOperations.length];
        for (int i = 0; i < mathOperations.length; i++) {
            result = calculate(mathOperations[i].getNumber1(), mathOperations[i].getNumber2(),
                    mathOperations[i].getMathSymbol());
            results[i] = new Result(result);
        }
        return results;
    }
}
