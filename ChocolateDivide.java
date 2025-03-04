import java.util.Scanner;

public class ChocolateDivide {
    // Method to find the quotient and reminder
    public static int[] findRemainderAndQuotient(int number, int divisor) {
        int quotient = number/divisor;
        int reminder = number%divisor;
        return new int[]{quotient, reminder}; // Returning an array with quotient and reminder
    }

    public static void main(String[] args) {
        // user input
        Scanner scanner = new Scanner(System.in);

        // Get user input for 2 numbers
        System.out.print("Enter the number of chocolates: ");
        int number = scanner.nextInt();
        System.out.print("Enter the number of children: ");
        int divisor = scanner.nextInt();

        // Call the method to find number of chocolates divided and remaining chocolates
        int[] result = findRemainderAndQuotient(number, divisor);

        // Display the results
        System.out.println("Number Of chocolates divided: " + result[0]);
        System.out.println("Remaining Chocolates : " + result[1]);
    }
}

