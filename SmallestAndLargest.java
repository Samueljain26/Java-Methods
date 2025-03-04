import java.util.Scanner;

public class SmallestAndLargest {
    // Method to find the smallest and largest of three numbers
    public static int[] findSmallestAndLargest(int number1, int number2, int number3) {
        int smallest = Math.min(Math.min(number1, number2), number3);
        int largest = Math.max(Math.max(number1, number2), number3);
        return new int[]{smallest, largest}; // Returning an array with smallest and largest
    }

    public static void main(String[] args) {
        // user input
        Scanner scanner = new Scanner(System.in);

        // Get user input for three numbers
        System.out.print("Enter first number: ");
        int num1 = scanner.nextInt();
        System.out.print("Enter second number: ");
        int num2 = scanner.nextInt();
        System.out.print("Enter third number: ");
        int num3 = scanner.nextInt();

        // Call the method to find smallest and largest numbers
        int[] result = findSmallestAndLargest(num1, num2, num3);

        // Display the results
        System.out.println("Smallest number: " + result[0]);
        System.out.println("Largest number: " + result[1]);
    }
}
