import java.util.Scanner;

public class Application {

    public void run() {
        Scanner scanner = new Scanner(System.in);
        Calculator calculator = new Calculator("results.txt");


        System.out.println("Enter the first number");
        calculator.setNum1(scanner.nextInt());

        System.out.println("Enter operation - add(+), subtract(-), multiply(*), divide(/)");
        String operation = scanner.next();

        System.out.println("Enter the second number");
        calculator.setNum2(scanner.nextInt());

        double result;

        switch (operation) {
            case "+" -> result = calculator.add();
            case "-" -> result = calculator.subtract();
            case "*" -> result = calculator.multiply();
            case "/" -> result = calculator.divide();
            default -> throw new IllegalStateException("Invalid operation");
        }
        System.out.println("Result = " + result);
        scanner.close();

        SaveToFile.writeResultToFile(result);

    }


}
