import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Application {

    public void run(){
    Scanner scanner = new Scanner(System.in);
    Calculator calculator = new Calculator("results.txt");


        System.out.println("Enter the first number");
        calculator.setNum1(scanner.nextInt());

        System.out.println("Enter operation - add(+), subtract(-), multiply(*), divide(/)");
    char operation = scanner.next().charAt(0);

        System.out.println("Enter the second number");
        calculator.setNum2(scanner.nextInt());

    double result;


        switch (operation) {
        case '+' -> result = calculator.add();
        case '-' -> result = calculator.subtract();
        case '*' -> result = calculator.multiply();
        case '/' -> result = calculator.divide();
        default -> throw new IllegalStateException("Invalid operation");
    }
        System.out.println("Result = " + result);
        scanner.close();

        try {
            SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
            String date = sdf.format(new Date());
            String filename = "calculations.txt";
            File file = new File(filename);
            FileWriter fileWriter = new FileWriter(file, true);
            fileWriter.write("The result is : " + result + "\n" + "The result was saved on: " + date);
            fileWriter.close();
        } catch (IOException e) {
            System.out.println("Error writing to file: " + e.getMessage());
        }

    }
}
