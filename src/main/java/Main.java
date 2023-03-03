import java.io.IOException;

class Main {
    public static void main(String[] args) {
        String fileName1 = "operations.txt";
        String fileName2 = "operationsResults.txt";
        MathOperationsWriter operationsWriter = new MathOperationsWriter();
        MathOperationsReader operationsReader = new MathOperationsReader();
        Calculator calculator = new Calculator();
        try {
            operationsWriter.writeToFile("1 + 2 \n" + "2 + 2 \n" + "3 - 1", fileName1);
            MathOperation[] mathOperations = operationsReader.read(fileName1);
            Result[] results = calculator.calculateAndPrint(mathOperations);
            String operationWithResults = operationsWriter.buildResultsText(mathOperations, results);
            operationsWriter.writeToFile(operationWithResults, fileName2);
        } catch (IOException e) {
            System.out.println("Błąd odczytu lub zapisu pliku");
        }
    }
}