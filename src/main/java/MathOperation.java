public class MathOperation {

    private int number1;
    private int number2;
    private String mathSymbol;

    public MathOperation(int number1, int number2, String mathSymbol) {
        this.number1 = number1;
        this.number2 = number2;
        this.mathSymbol = mathSymbol;
    }

    @Override
    public String toString() {
        return number1 + " " + mathSymbol + " " + number2;
    }

    public int getNumber1() {
        return number1;
    }

    public void setNumber1(int number1) {
        this.number1 = number1;
    }

    public int getNumber2() {
        return number2;
    }

    public void setNumber2(int number2) {
        this.number2 = number2;
    }

    public String getMathSymbol() {
        return mathSymbol;
    }

    public void setMathSymbol(String mathSymbol) {
        this.mathSymbol = mathSymbol;
    }
}
