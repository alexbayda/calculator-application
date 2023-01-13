import java.io.*;
import java.util.Scanner;

public class Application  {


    public static void main(String[] args) {
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
        try {
            calculator.saveResults();
            System.out.println("Results saved in the file: "+ calculator.file.getName());
        } catch (IOException e) {
            e.printStackTrace();
        }
        scanner.close();
    }
}

