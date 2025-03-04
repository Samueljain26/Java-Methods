import java.util.Scanner;

public class HandshakeCalculator {
    // Method to calculate maximum handshakes using combination formula
    public static int maxHandshakes(int n) {
        return (n * (n - 1)) / 2; 
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // Get input for number of students
        System.out.print("Enter the number of students: ");
        int n = scanner.nextInt();
            // Calculate and print maximum handshakes
            int maxHandshakes = maxHandshakes(n);
            System.out.println("Maximum number of handshakes: " + maxHandshakes);
}
}
