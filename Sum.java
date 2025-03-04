import java.util.*;

class Sum {
    // Method to find the sum of n natural numbers using recursion
    public static int sumRecursive(int n) {
        if (n == 1) {
            return 1;
        }
        return n + sumRecursive(n - 1);
    }

    // Method to find the sum using the formula
    public static int sumFormula(int n) {
        return n * (n + 1) / 2;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // Get user input
        System.out.print("Enter a natural number: ");
        int n = scanner.nextInt();
        // Check if input is a natural number
        if (n <= 0) {
            System.out.println("Please enter a valid number ");
            return;
        }
        // Compute sum using recursion and formula
        int sumRec = sumRecursive(n);
        int sumForm = sumFormula(n);
        // Display results
        System.out.println("Sum using recursion: " + sumRec);
        System.out.println("Sum using formula: " + sumForm);
        
        if (sumRec == sumForm) {
            System.out.println("The sum is correct.");
        } else {
            System.out.println("Mismatch found");
        }
    }
}
