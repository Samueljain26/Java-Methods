import java.util.*;

class RandomDigit {
    // Method to generate an array of random digits (1 to 9)
    public static int[] generate4DigitRandomArray(int size) {
        int[] number = new int[size]; // Declare the array
        for (int i = 0; i < size; i++) {
            number[i] = (int) (Math.random() * 9) + 1;
        }
        return number;
    }
    // Method to find the average, min, and max value of an array
    public static double[] findAverageMinMax(int[] number) {
        double sum = 0;
        int min = number[0];
        int max = number[0];
        for (int i = 0; i < number.length; i++) {
            sum += number[i];
            min = Math.min(min, number[i]);
            max = Math.max(max, number[i]);
        }
        double average = sum / number.length;
        return new double[]{average, min, max};
    }
    public static void main(String[] args) {
        int size = 4;
        //calling the method
        int[] number = generate4DigitRandomArray(size);
            //printing output
        System.out.println("Generated numbers: " + Arrays.toString(number));
        double[] results = findAverageMinMax(number);
        System.out.println("Average: " + results[0]);
        System.out.println("Minimum: " + results[1]);
        System.out.println("Maximum: " + results[2]);
    }
}

