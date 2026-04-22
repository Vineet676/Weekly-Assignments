import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double number1 = 0, number2 = 0;
        double add, sub, mul, div;

        while (true) {
            System.out.print("Enter first number: ");
            if (sc.hasNextDouble()) {
                number1 = sc.nextDouble();
            } else {
                System.out.println("Invalid input");
                sc.next();
                continue;
            }

            System.out.print("Enter second number: ");
            if (sc.hasNextDouble()) {
                number2 = sc.nextDouble();
                break;
            } else {
                System.out.println("Invalid input");
                sc.next();
            }
        }

        add = number1 + number2;
        sub = number1 - number2;
        mul = number1 * number2;

        if (number2 != 0) {
            div = number1 / number2;
        } else {
            System.out.println("Division by zero not possible");
            sc.close();
            return;
        }

        System.out.println("The addition, subtraction, multiplication, and division value of 2 numbers "
                + number1 + " and " + number2 + " is "
                + add + ", " + sub + ", " + mul + ", and " + div);

        sc.close();
    }
}