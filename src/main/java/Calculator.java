public class Calculator {

    private double num1;
    private double num2;

    public void setNum1(double num1) {
        if (num1 < -20 || num1 > 20) {
            System.out.println("Number should only be between -20 and 20");
            return;
        }
        this.num1 = num1;
    }

    public void setNum2(double num2) {
        if (num2 < -20 || num2 > 20) {
            System.out.println("Number should only be between -20 and 20");
            return;
        }
        this.num2 = num2;
    }

    public double add() {
        return num1 + num2;
    }

    public double subtract() {
        return num1 - num2;
    }

    public double multiply() {
        return num1 * num2;
    }

    public double divide() {
        if (num2 == 0) {
            System.out.println("Cannot divide by 0");
            return Double.NaN;
        }
        return num1 / num2;
    }
}

