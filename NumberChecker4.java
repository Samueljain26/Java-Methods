import java.util.*;

class NumberChecker4 {

    // Method to count the number of digits in a number
    public static int countDigits(int number) {
        return String.valueOf(number).length(); 
    }

    // Method to store digits in an array
    public static int[] getDigitsArray(int number) {
        int numDigits = countDigits(number);
        int temp =number;
        int[] digits = new int[numDigits];
        for (int i = numDigits - 1; i >= 0; i--) {
            digits[i] = temp % 10;
            temp /= 10;
        }
        return digits;
    }

    // Method to reverse the digits array
    public static int[] reverseArray(int[] digits) {
        int length = digits.length;
        int[] reversed = new int[length];

        for (int i = 0; i < length; i++) {
            reversed[i] = digits[length - 1 - i];
        }
        return reversed;
    }

    // Method to compare two arrays and check if they are equal
    public static boolean areArraysEqual(int[] arr1, int[] arr2) {
        return Arrays.equals(arr1, arr2); // Directly compares array elements
    }

    // Method to check if a number is a palindrome using the digits array
    public static boolean isPalindrome(int number) {
        int[] digits = getDigitsArray(number);
        int[] reversed = reverseArray(digits);
        return areArraysEqual(digits, reversed); 
    }

    // Method to check if a number is a duck number (contains zero, but not as first digit)
    public static boolean isDuckNumber(int number) {
        int[] digits = getDigitsArray(number);

        // Start checking from index 1 to ensure zero is not the first digit
        for (int i = 1; i < digits.length; i++) {
            if (digits[i] == 0) {
                return true;
            }
        }
        return false;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // Taking user input
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();

        // Display results
        System.out.println("\nNumber: " + number);
        System.out.println("Number of Digits: " + countDigits(number));

        int[] digits = getDigitsArray(number);
        System.out.println("Digits Array: " + Arrays.toString(digits));

        int[] reversed = reverseArray(digits);
        System.out.println("Reversed Digits Array: " + Arrays.toString(reversed));

        System.out.println("Is Palindrome? " + isPalindrome(number));
        System.out.println("Is Duck Number? " + isDuckNumber(number));
    }
}
