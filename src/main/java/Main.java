import java.io.IOException;

class Main {
    public static void main(String[] args) {
        String fileName1 = "operations.txt";
        String fileName2 = "operationsResults.txt";
        MathOperationsWriter operationsWriter = new MathOperationsWriter();
        MathOperationsReader operationsReader = new MathOperationsReader();
        MathOperation operation = new MathOperation();
        try {
            operationsWriter.writeToFile("1 + 2 \n" + "2 + 2 \n" + "3 - 1", fileName1);
            String text = operationsReader.readFile(fileName1);
            String[] tab = operationsReader.createArrayFromText(text);
            int number1 = Integer.parseInt(tab[0]);
            int number2 = Integer.parseInt(tab[2]);
            int number3 = Integer.parseInt(tab[3]);
            int number4 = Integer.parseInt(tab[5]);
            int number5 = Integer.parseInt(tab[6]);
            int number6 = Integer.parseInt(tab[8]);
            int result1 = operation.calculate(number1, number2, tab[1]);
            int result2 = operation.calculate(number3, number4, tab[4]);
            int result3 = operation.calculate(number5, number6, tab[7]);
            String text2 = tab[0] + " " + tab[1] + " " + tab[2] + " = " + result1 + " \n" +
                    tab[3] + " " + tab[4] + " " + tab[5] + " = " + result2 + " \n" +
                    tab[6] + " " + tab[7] + " " + tab[8] + " = " + result3;
            operationsWriter.writeToFile(text2, fileName2);
        } catch (IOException e) {
            System.out.println("Błąd odczytu lub zapisu pliku");
        }
    }
}