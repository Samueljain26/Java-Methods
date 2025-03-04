import java.util.*;

class Factors {
    // Method to find factors and return them as an array
    public static int[] factors(int number) {
        int count = 0;
        for (int i = 1; i <= number; i++) {
            if (number % i == 0) {
                count++;
            }
        }
        int[] factorArray = new int[count];
        int index = 0;
        for (int i = 1; i <= number; i++) {
            if (number % i == 0) {
                factorArray[index++] = i;
            }
        }
        return factorArray;
    }

    // Method to find the sum of factors
    public static int sumOfFactors(int[] factors) {
        int sum = 0;
        for (int i = 0; i < factors.length; i++) {
            sum += factors[i];
        }
        return sum;
    }

    // Method to find the product of factors
    public static int productOfFactors(int[] factors) {
        int product = 1;
        for (int i = 0; i < factors.length; i++) {
            product *= factors[i];
        }
        return product;
    }

    // Method to find the sum of squares of factors
    public static int sumOfSquaresOfFactors(int[] factors) {
        int sum = 0;
        for (int i = 0; i < factors.length; i++) {
            sum += Math.pow(factors[i], 2);
        }
        return sum;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // Get user input for number
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();
        // Find factors
        int[] factors = factors(number);
        // Display factors
        System.out.print("Factors: ");
        for (int i = 0; i < factors.length; i++) {
            System.out.print(factors[i] + " ");
        }
        System.out.println();

        // Display results
        System.out.println("Sum of factors: " + sumOfFactors(factors));
 	System.out.println("Product of factors: " + productOfFactors(factors));
        System.out.println("Sum of squares of factors: " + sumOfSquaresOfFactors(factors));
    }
}
