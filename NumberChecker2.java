import java.util.*;

class NumberChecker2 {
    // Method to count digits in a number
    public static int countDigits(int number) {
        return String.valueOf(number).length(); // Handle negative numbers
    }
    // Method to store digits in an array
    public static int[] getDigitsArray(int number) {
        int numDigits = countDigits(number);
        int[] digits = new int[numDigits];
        int temp =number;
        for (int i = numDigits - 1; i >= 0; i--) {
            digits[i] = temp % 10;
            temp /= 10;
        }
        return digits;
    }
    // Method to find the sum of digits
    public static int sumOfDigits(int[] digits) {
        int sum = 0;
        for (int digit : digits) {
            sum += digit;
        }
        return sum;
    }

    // Method to find the sum of squares of digits
    public static int sumOfSquares(int[] digits) {
        int sum = 0;
        for (int digit : digits) {
            sum += Math.pow(digit, 2); // Squaring each digit
        }
        return sum;
    }

    // Method to check if a number is a Harshad number
    public static boolean isHarshad(int number) {
        int[] digits = getDigitsArray(number);
        int sum = sumOfDigits(digits);
        return number % sum == 0; // Check divisibility
    }

    // Method to find the frequency of each digit
    public static int[][] digitFrequency(int number) {
        int[] digits = getDigitsArray(number);
        int[][] frequency = new int[10][2]; // 10 rows for digits 0-9
        // Initialize digit column
        for (int i = 0; i < 10; i++) {
            frequency[i][0] = i; 
        }
        // Count frequency
        for (int digit : digits) {
            frequency[digit][1]++;
        }
        return frequency;
    }
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("Number: " );
        int number =sc.nextInt();
        System.out.println("Number of Digits: " + countDigits(number));

        int[] digits = getDigitsArray(number);
        System.out.println("Digits Array: " + Arrays.toString(digits));

        System.out.println("Sum of Digits: " + sumOfDigits(digits));
        System.out.println("Sum of Squares of Digits: " + sumOfSquares(digits));

        System.out.println("Is Harshad Number? " + isHarshad(number));

        // Print frequency of each digit
        int[][] frequency = digitFrequency(number);
        System.out.println("Digit Frequency:");
        for (int i = 0; i < 10; i++) {
            if (frequency[i][1] > 0) {
                System.out.println("Digit " + frequency[i][0] + ": " + frequency[i][1] + " times");
            }
        }
    }
}
