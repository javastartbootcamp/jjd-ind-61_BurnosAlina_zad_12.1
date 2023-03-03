import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class MathOperationsWriter {

    String buildResultsText(MathOperation[] mathOperations, Result[] results) {
        String text = "";
        for (int i = 0; i < mathOperations.length; i++) {
            text += mathOperations[i].toString() + results[i].toString();
        }
        return text;
    }

    void writeToFile(String text, String fileName) throws IOException {
        BufferedWriter writer = new BufferedWriter(new FileWriter(fileName));
        writer.write(text);
        writer.newLine();
        writer.flush();
    }
}
