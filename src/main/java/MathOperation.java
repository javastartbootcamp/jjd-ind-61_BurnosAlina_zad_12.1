public class MathOperation {

    int calculate(int number1, int number2, String mathSymbol) {
        int result = 0;
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
}
