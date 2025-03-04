import java.util.Scanner;

public class TemperatureUnitConverter {
    // Method to convert Fahrenheit to Celsius
    public static double convertFahrenheitToCelsius(double fahrenheit) {
        return (fahrenheit - 32) * 5 / 9;
    }
    // Method to convert Celsius to Fahrenheit
    public static double convertCelsiusToFahrenheit(double celsius) {
        return (celsius * 9 / 5) + 32;
    }
    // Method to convert pounds to kilograms
    public static double convertPoundsToKilograms(double pounds) {
        return pounds * 0.453592;
    }
    // Method to convert kilograms to pounds
    public static double convertKilogramsToPounds(double kilograms) {
        return kilograms * 2.20462;
    }
    // Method to convert gallons to liters
    public static double convertGallonsToLiters(double gallons) {
        return gallons * 3.78541;
    }
    // Method to convert liters to gallons
    public static double convertLitersToGallons(double liters) {
        return liters * 0.264172;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Convert Fahrenheit to Celsius
        System.out.print("Enter temperature in Fahrenheit: ");
        double fahrenheit = sc.nextDouble();
        System.out.println("Temperature in Celsius: " + convertFahrenheitToCelsius(fahrenheit));
        // Convert Celsius to Fahrenheit
        System.out.print("Enter temperature in Celsius: ");
        double celsius = sc.nextDouble();
        System.out.println("Temperature in Fahrenheit: " + convertCelsiusToFahrenheit(celsius));
        // Convert pounds to kilograms
        System.out.print("Enter weight in pounds: ");
        double pounds = sc.nextDouble();
        System.out.println("Weight in kilograms: " + convertPoundsToKilograms(pounds));
        // Convert kilograms to pounds
        System.out.print("Enter weight in kilograms: ");
        double kilograms = sc.nextDouble();
        System.out.println("Weight in pounds: " + convertKilogramsToPounds(kilograms));
        // Convert gallons to liters
        System.out.print("Enter volume in gallons: ");
        double gallons = sc.nextDouble();
        System.out.println("Volume in liters: " + convertGallonsToLiters(gallons));
        // Convert liters to gallons
        System.out.print("Enter volume in liters: ");
        double liters = sc.nextDouble();
        System.out.println("Volume in gallons: " + convertLitersToGallons(liters));

        sc.close();
    }
}
