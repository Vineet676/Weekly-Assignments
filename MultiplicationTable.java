import java.util.Scanner;

public class MultiplicationTable {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num;
        int table[] = new int[10];

        System.out.print("Enter number: ");
        num = sc.nextInt();

        // Store
        for (int i = 1; i <= 10; i++) {
            table[i - 1] = num * i;
        }

        // Display
        for (int i = 1; i <= 10; i++) {
            System.out.println(num + " * " + i + " = " + table[i - 1]);
        }
    }
}