import java.util.Scanner;

public class Divide {
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
        System.out.print("Enter number: ");
        int number = scanner.nextInt();
        System.out.print("Enter divisor: ");
        int divisor = scanner.nextInt();

        // Call the method to find smallest and largest numbers
        int[] result = findRemainderAndQuotient(number, divisor);

        // Display the results
        System.out.println("quotient: " + result[0]);
        System.out.println("reminder: " + result[1]);
    }
}

