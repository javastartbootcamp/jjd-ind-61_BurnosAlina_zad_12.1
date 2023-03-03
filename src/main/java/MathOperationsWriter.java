import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class MathOperationsWriter {

    void writeToFile(String text, String fileName) throws IOException {
        BufferedWriter writer = new BufferedWriter(new FileWriter(fileName));
        writer.write(text);
        writer.newLine();
        writer.flush();
    }
}
