import java.util.Scanner;

public class StudentVoteChecker {
    // Method to check if a student can vote
    public static boolean canStudentVote(int age) {
        if (age < 0) {
            return false; 
        }
        else if(age >=18){
            return true;
        }
        else{
        return false;
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] arr = new int[10]; // Array to store ages of 10 students
        // Loop to get input from the user
        for (int i = 0; i < arr.length; i++) {
            System.out.print("Enter age of student " + (i + 1) + ": ");
            arr[i] = scanner.nextInt();
        }
        // output
        for (int i = 0; i < arr.length; i++) {
            if (canStudentVote(arr[i])==true) {
                System.out.println("Student " + (i + 1) + " (Age: " + arr[i] + ") can vote.");
            }
                else {
                System.out.println("Student " + (i + 1) + " (Age: " + arr[i] + ") cannot vote.");
            }
        }
    }
}
