import java.util.Arrays;
import java.util.Scanner;

class NumberChecker {
    // Method to find the count of digits in the number
    public static int countDigits(int number) {
        return String.valueOf(number).length();
        }
    // Method to store the digits of the number in an array
    public static int[] getDigitsArray(int number) {
        int numDigits = countDigits(number); // Get digit count
        int[] digits = new int[numDigits];
        int temp=number;
   
        for (int i = numDigits - 1; i >= 0; i--) { 
            digits[i] = temp % 10; // Extract last digit
            temp /= 10; 
        }
        return digits;
    }
    // Method to check if a number is a Duck Number (contains '0')
    public static boolean isDuckNumber(int number) {
        return String.valueOf(number).contains("0");
    }

    // Method to check if a number is an Armstrong number
    public static boolean isArmstrongNumber(int number) {
        int[] digits = getDigitsArray(number);
        int sum = 0;
        int power = digits.length;

        for (int digit : digits) {
            sum += Math.pow(digit, power);
        }

        return sum == number;
    }

    // Method to find the largest and second largest digits
    public static int[] findLargestAndSecondLargest(int[] digits) {
        Arrays.sort(digits);
        int largest = digits[digits.length - 1];
        int secondLargest = digits[digits.length - 2];
        return new int[]{largest, secondLargest};
    }

    // Method to find the smallest and second smallest digits
    public static int[] findSmallestAndSecondSmallest(int[] digits) {
        Arrays.sort(digits);
        int smallest = digits[0];
        int secondSmallest = digits[1];
        return new int[]{smallest, secondSmallest};
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Number: " );
        int number =sc.nextInt();
        System.out.println("Digit Count: " + countDigits(number));

        int[] digits = getDigitsArray(number);
        System.out.println("Digits Array: " + Arrays.toString(digits));

        System.out.println("Is Duck Number? " + isDuckNumber(number));
        System.out.println("Is Armstrong Number? " + isArmstrongNumber(number));

        int[] largestValues = findLargestAndSecondLargest(digits);
        System.out.println("Largest: " + largestValues[0] + ", Second Largest: " + largestValues[1]);

        int[] smallestValues = findSmallestAndSecondSmallest(digits);
        System.out.println("Smallest: " + smallestValues[0] + ", Second Smallest: " + smallestValues[1]);
    }
}
