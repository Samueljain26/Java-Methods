import java.util.*;

public class Trigonometry {
    // Method to calculate various trigonometric functions
    public static double[] calculateTrigonometricFunctions(double angle) {
        double radians = Math.toRadians(angle);
        double sine = Math.sin(radians);
        double cosine = Math.cos(radians);
        double tangent = Math.tan(radians);
        return new double[]{sine, cosine, tangent};
    }

    public static void main(String[] args) {
        // User input
        Scanner scanner = new Scanner(System.in);
        // Get user input for angle
        System.out.print("Enter angle: ");
        double angle = scanner.nextDouble();
        // Calculate trigonometric functions
        double[] results = calculateTrigonometricFunctions(angle);
        // Display the results
        System.out.println("Sine: "+ results[0]);
        System.out.println("Cosine: "+ results[1]);
        System.out.println("Tangent: "+ results[2]);
    }
}
