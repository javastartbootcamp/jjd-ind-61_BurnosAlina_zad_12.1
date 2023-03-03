import java.io.*;
import java.util.Scanner;

public class MathOperationsReader {

    String readFile(String fileName) throws IOException {
        Scanner scanner = new Scanner(new File(fileName));
        StringBuilder text = new StringBuilder();
        while (scanner.hasNextLine()) {
            text.append(scanner.nextLine());
        }
        return text.toString();
    }

    String[] createArrayFromText(String text) {
        return text.split(" ");
    }
}
