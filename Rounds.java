import java.util.Scanner;

public class Rounds {
	//method to find perimeter and number of rounds
    public static double perimeter(double side1,double side2, double side3) {
        double perimeter = side1+side2+side3;
        double rounds = 5/perimeter;
        return rounds;
    }
    public static void main(String[] args) {
	//taking user input
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the side 1 of triangle in m: ");
        double side1 = scanner.nextDouble()/1000;
        System.out.print("Enter the side 2 of triangle in m: ");
        double side2 = scanner.nextDouble()/1000;
        System.out.print("Enter the side 3 of triangle in m: ");
        double side3 = scanner.nextDouble()/1000;
	//calling the method
        double rounds = perimeter(side1,side2,side3);
	//printing the output
        System.out.print("Number of rounds: " + rounds);
}
}
