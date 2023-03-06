import java.io.*;

public class MathOperationsReader {

    MathOperation[] read(String fileName) throws IOException {
        BufferedReader reader = new BufferedReader(new FileReader(fileName));
        int linesNumber = countLines(fileName);
        MathOperation[] mathOperations = new MathOperation[linesNumber];
        for (int i = 0; i < linesNumber; i++) {
            String line = reader.readLine();
            String[] mathOperationData = line.split(" ");
            double number1 = Double.parseDouble(mathOperationData[0]);
            String mathSymbol = mathOperationData[1];
            double number2 = Double.parseDouble(mathOperationData[2]);
            mathOperations[i] = new MathOperation(number1, number2, mathSymbol);
        }
        return mathOperations;
    }

    private int countLines(String fileName) throws IOException {
        BufferedReader reader = new BufferedReader(new FileReader(fileName));
        int counter = 0;
        while (reader.readLine() != null) {
            counter++;
        }
        return counter;
    }
}
