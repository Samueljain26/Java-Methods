import java.util.*;

class NumberChecker5 {

    // Method to check if a number is prime
    public static boolean isPrime(int number) {
        if (number <= 1) return false;
        for (int i = 2; i < number; i++) {
            if (number % i == 0) {
            return false;
        }
    }
        return true;
    }
    // Method to check if a number is a neon number
    public static boolean isNeon(int number) {
        int square = number * number;
        int sum = 0;
        while (square > 0) {
            sum += square % 10;
            square /= 10;
        }
        return sum == number;
    }
    // Method to check if a number is a spy number
    public static boolean isSpy(int number) {
        int sum = 0, product = 1;
        int temp = number;

        while (temp > 0) {
            int digit = temp % 10;
            sum += digit;
            product *= digit;
            temp /= 10;
        }
        return sum == product;
    }
    // Method to check if a number is an automorphic number
    public static boolean isAutomorphic(int number) {
        int square = number * number;
         if(square%10==number){
            return true;
         }
         else{
            return false;
         }
    }

    // Method to check if a number is a buzz number
    public static boolean isBuzz(int number) {
        return (number % 7 == 0) || (number % 10 == 7);
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Taking user input
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();

        // Display results
        System.out.println("\nNumber: " + number);
        System.out.println("Is Prime? " + isPrime(number));
        System.out.println("Is Neon Number? " + isNeon(number));
        System.out.println("Is Spy Number? " + isSpy(number));
        System.out.println("Is Automorphic Number? " + isAutomorphic(number));
        System.out.println("Is Buzz Number? " + isBuzz(number));
    }
}
