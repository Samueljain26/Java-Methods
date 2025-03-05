import java.util.*;

public class IsPositive {
    // Method to check if a number is positive or negative
    public static boolean isPositive(int num) {
        return (num > 0);
    }
    // Method to check if a number is even or odd
    public static boolean isEven(int num) {
        return (num % 2 == 0);
    }
    // Method to compare two numbers
    public static int compare(int num1, int num2) {
        if (num1 > num2) {
            return 1;
        } else if (num1 == num2) {
            return 0;
        } else {
            return -1;
        }
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] arr = new int[5];

        // Taking user input
        System.out.println("Enter 5 numbers:");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = scanner.nextInt();
        }

        // Checking each number
        for (int i = 0; i < arr.length; i++) {
            if (isPositive(arr[i])) {
                System.out.print(arr[i] + " is Positive and ");
                if (isEven(arr[i])) {
                    System.out.println("Even.");
                } else {
                    System.out.println("Odd.");
                }
            } else {
                System.out.println(arr[i] + " is Negative.");
            }
        }

        // Comparing first and last elements
        int result = compare(arr[0], arr[arr.length - 1]);
        if (result == 1) {
            System.out.println(arr[0] + " is greater than " + arr[arr.length - 1]);
        } else if (result == 0) {
            System.out.println(arr[0] + " is equal to " + arr[arr.length - 1]);
        } else {
            System.out.println(arr[arr.length - 1] + " is greater than " + arr[0]);
        }
    }
}
