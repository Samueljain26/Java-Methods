import java.util.*;

public class UnitConvertor {
    // Method To convert kilometers to miles and return the value
    public static double convertKmToMiles(double km) {
        double km2miles = 0.621371;
        return km * km2miles;
    }
    // Method To convert miles to kilometers and return the value
    public static double convertMilesToKm(double miles) {
        double miles2km = 1.60934;
        return miles * miles2km;
    }
    // Method To convert meters to feet and return the value
    public static double convertMetersToFeet(double meters) {
        double meters2feet = 3.28084;
        return meters * meters2feet;
    }
    // Method To convert feet to meters and return the value
    public static double convertFeetToMeters(double feet) {
        double feet2meters = 0.3048;
        return feet * feet2meters;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Convert km to miles and taking user input
        System.out.print("Enter the distance in kilometers: ");
        double km = sc.nextDouble();
        System.out.println("Distance in miles: " + convertKmToMiles(km));

        // Convert miles to km
        System.out.print("Enter the distance in miles: ");
        double miles = sc.nextDouble();
        System.out.println("Distance in kilometers: " + convertMilesToKm(miles));

        // Convert meters to feet
        System.out.print("Enter the distance in meters: ");
        double meters = sc.nextDouble();
        System.out.println("Distance in feet: " + convertMetersToFeet(meters));

        // Convert feet to meters
        System.out.print("Enter the distance in feet: ");
        double feet = sc.nextDouble();
        System.out.println("Distance in meters: " + convertFeetToMeters(feet));
    }
}
