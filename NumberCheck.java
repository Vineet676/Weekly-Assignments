import java.util.Scanner;

public class NumberCheck {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int arr[] = new int[5];

        // Input
        for (int i = 0; i < 5; i++) {
            System.out.print("Enter number: ");
            arr[i] = sc.nextInt();
        }

        // Check
        for (int i = 0; i < 5; i++) {
            if (arr[i] > 0) {
                if (arr[i] % 2 == 0)
                    System.out.println(arr[i] + " is positive and even");
                else
                    System.out.println(arr[i] + " is positive and odd");
            } else if (arr[i] < 0) {
                System.out.println(arr[i] + " is negative");
            } else {
                System.out.println("Zero");
            }
        }

        // Compare first and last
        if (arr[0] == arr[4])
            System.out.println("Equal");
        else if (arr[0] > arr[4])
            System.out.println("First is greater");
        else
            System.out.println("Last is greater");
    }
}
