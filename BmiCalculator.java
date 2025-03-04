import java.util.Scanner;

public class BmiCalculator {
    // Method to calculate BMI and update the array
    public static void calculateBMI(double[][] bmiData) {
        for (int i = 0; i < bmiData.length; i++) {
            double weight = bmiData[i][0];
            double heightInMeters = bmiData[i][1] / 100; 
            double bmi = weight / (heightInMeters * heightInMeters); 
            bmiData[i][2] = bmi; // Store BMI in the third column
        }
    }

    // Method to determine BMI status and return an array of status
    public static String[] determineBMIStatus(double[][] bmiData) {
        String[] status = new String[bmiData.length];
        for (int i = 0; i < bmiData.length; i++) {
            double bmi = bmiData[i][2];
            if (bmi <= 18.4) {
                status[i] = "Underweight";
            } else if (bmi >= 18.5 && bmi <= 24.9) {
                status[i] = "Normal";
            } else if (bmi >= 25.0 && bmi <= 39.9) {
                status[i] = "Overweight";
            } else {
                status[i] = "Obese";
            }
        }
        return status;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double[][] bmiData = new double[10][3]; // 10 rows, 3 columns (weight, height, BMI)
        // Taking user input
        for (int i = 0; i < 10; i++) {
            System.out.println("Enter weight (kg) of person " + (i + 1) + ":");
            bmiData[i][0] = sc.nextDouble();
            System.out.println("Enter height (cm) of person " + (i + 1) + ":");
            bmiData[i][1] = sc.nextDouble();
        }
        // Calculate BMI (modifies bmiData in-place)
        calculateBMI(bmiData);
        // Get BMI status
        String[] status = determineBMIStatus(bmiData);
        // Display results 
        for (int i = 0; i < 10; i++) {
            System.out.println("\nPerson " + (i + 1) + ":");
            System.out.println("Weight: " + bmiData[i][0] + " kg");
            System.out.println("Height: " + bmiData[i][1] + " cm");
            System.out.println("BMI: " + bmiData[i][2]);
            System.out.println("Status: " + status[i]);
        }
    }
}
