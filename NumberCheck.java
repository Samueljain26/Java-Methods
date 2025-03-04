import java.util.Scanner;

public class NumberCheck {
    // Method to determine whether a number is positive, negative, or zero
    public static int checkNumber(int num) {
        if (num > 0) {
            return 1;  
        } else if (num < 0) {
            return -1; 
        } else {
            return 0; 
        }
    }

    public static void main(String[] args) {
        //  user input
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();

        // Call method to check the number
        int result = checkNumber(number);

        // Display result based on returned value
        if (result == 1) {
            System.out.println("The number is Positive.");
        } else if (result == -1) {
            System.out.println("The number is Negative.");
        } else {
            System.out.println("The number is Zero.");
        }
    }
}
