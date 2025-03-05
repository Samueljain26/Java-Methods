import java.util.*;

class Marks { 
    // Method to generate random marks for Physics, Chemistry, and Math
    public static int[][] generateMarks(int numStudents) {
        Random rand = new Random();
        int[][] marks = new int[numStudents][3]; // 3 subjects: PCM

        for (int i = 0; i < numStudents; i++) {
            marks[i][0] = 10 + rand.nextInt(91); // Physics (40-100)
            marks[i][1] = 10 + rand.nextInt(91); // Chemistry (40-100)
            marks[i][2] = 10 + rand.nextInt(91); // Math (40-100)
        }
        return marks;
    }
    // Method to calculate total, average, and percentage
    public static double[][] calculateScores(int[][] marks) {
        int numStudents = marks.length;
        double[][] results = new double[numStudents][3]; // Total, Average, Percentage

        for (int i = 0; i < numStudents; i++) {
            int total = marks[i][0] + marks[i][1] + marks[i][2];
            double average = total / 3.0;
            double percentage = (total / 300.0) * 100;

            results[i][0] = total;
            results[i][1] = Math.round(average * 100.0) / 100.0; // Round to 2 decimal places
            results[i][2] = Math.round(percentage * 100.0) / 100.0; // Round to 2 decimal places
        }
        return results;
    }

    // Method to display the scorecard in a tabular format
    public static void displayScorecard(int[][] marks, double[][] results) {
        System.out.printf("%-10s %-10s %-10s %-10s %-10s %-10s %-10s\n", "Student", "Physics", "Chemistry", "Math", "Total", "Average", "Percentage");

        for (int i = 0; i < marks.length; i++) {
            System.out.printf("%-10d %-10d %-10d %-10d %-10.2f %-10.2f %-10.2f\n", 
                (i + 1), marks[i][0], marks[i][1], marks[i][2], results[i][0], results[i][1], results[i][2]);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Take input for number of students
        System.out.print("Enter the number of students: ");
        int numStudents = sc.nextInt();

        // Generate random marks
        int[][] marks = generateMarks(numStudents);

        // Calculate total, average, and percentage
        double[][] results = calculateScores(marks);

        // Display the scorecard
        displayScorecard(marks, results);
    }
}
