import java.util.*;

public class Collinear {

    // Method to check collinearity using the slope formula
    static boolean isCollinearSlope(double x1, double y1, double x2, double y2, double x3, double y3) {
        double slopeAB = (y2 - y1) / (x2 - x1);
        double slopeBC = (y3 - y2) / (x3 - x2);
        double slopeAC = (y3 - y1) / (x3 - x1);

        return (slopeAB == slopeBC) && (slopeBC == slopeAC);
    }

    // Method to check collinearity using the area of a triangle formula
    static boolean isCollinearArea(double x1, double y1, double x2, double y2, double x3, double y3) {
        // Calculate area of triangle using determinant formula
        double area = 0.5 * (x1 * (y2 - y3) + x2 * (y3 - y1) + x3 * (y1 - y2));
        return area == 0;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Take inputs for 3 points
        System.out.println("Enter coordinates for point A (x1, y1): ");
        double x1 = scanner.nextDouble();
        double y1 = scanner.nextDouble();

        System.out.println("Enter coordinates for point B (x2, y2): ");
        double x2 = scanner.nextDouble();
        double y2 = scanner.nextDouble();

        System.out.println("Enter coordinates for point C (x3, y3): ");
        double x3 = scanner.nextDouble();
        double y3 = scanner.nextDouble();

        // Check collinearity using slope formula
        boolean collinearSlope = isCollinearSlope(x1, y1, x2, y2, x3, y3);
        System.out.println("\nUsing Slope Formula: " + (collinearSlope ? "Points are Collinear" : "Points are Not Collinear"));

        // Check collinearity using area of the triangle formula
        boolean collinearArea = isCollinearArea(x1, y1, x2, y2, x3, y3);
        System.out.println("Using Area of Triangle Formula: " + (collinearArea ? "Points are Collinear" : "Points are Not Collinear"));
    }
}
