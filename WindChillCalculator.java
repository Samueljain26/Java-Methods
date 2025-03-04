import java.util.*;

public class WindChillCalculator {
    // Method to calculate wind chill temperature
    public static double calculateWindChill(double temperature, double windSpeed) {
        return (35.74 + 0.6215 * temperature + (0.4275 * temperature - 35.75) * Math.pow(windSpeed, 0.16));
    }

    public static void main(String[] args) {
        // User input
        Scanner scanner = new Scanner(System.in);

        // Get user input for temperature and wind speed
        System.out.print("Enter temperature: ");
        double temperature = scanner.nextDouble();
        System.out.print("Enter wind speed: ");
        double windSpeed = scanner.nextDouble();

        // Calculate wind chill temperature
        double windChill = calculateWindChill(temperature, windSpeed);

        // Display the result
        System.out.print("The wind chill temperature is: " + windChill);

    }
}
