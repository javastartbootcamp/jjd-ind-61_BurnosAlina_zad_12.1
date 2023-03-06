public class Result {
    private double result;

    @Override
    public String toString() {
        return " = " + result + "\n";
    }

    public Result(double result) {
        this.result = result;
    }

    public double getResult() {
        return result;
    }

    public void setResult(double result) {
        this.result = result;
    }
}
