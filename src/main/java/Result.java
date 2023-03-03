public class Result {
    private int result;

    @Override
    public String toString() {
        return " = " + result + "\n";
    }

    public Result(int result) {
        this.result = result;
    }

    public int getResult() {
        return result;
    }

    public void setResult(int result) {
        this.result = result;
    }
}
