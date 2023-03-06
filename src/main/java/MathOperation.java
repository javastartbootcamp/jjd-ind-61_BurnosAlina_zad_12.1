public class MathOperation {

    private double number1;
    private double number2;
    private String mathSymbol;

    public MathOperation(double number1, double number2, String mathSymbol) {
        this.number1 = number1;
        this.number2 = number2;
        this.mathSymbol = mathSymbol;
    }

    @Override
    public String toString() {
        return number1 + " " + mathSymbol + " " + number2;
    }

    public double getNumber1() {
        return number1;
    }

    public void setNumber1(double number1) {
        this.number1 = number1;
    }

    public double getNumber2() {
        return number2;
    }

    public void setNumber2(double number2) {
        this.number2 = number2;
    }

    public String getMathSymbol() {
        return mathSymbol;
    }

    public void setMathSymbol(String mathSymbol) {
        this.mathSymbol = mathSymbol;
    }
}
