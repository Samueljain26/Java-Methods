import java.util.Scanner;

public class TotalSum {
    //method for sum
    static int sum(int number){
        int sum =0;
        for(int i=0;i<=number;i++){
             sum += i;
        }
        return sum;
    }
    public static void main(String[] args){
        Scanner sc =new Scanner(System.in);
        //taking user input
        System.out.print("Enter the number: ");
        int number =sc.nextInt();
        //calling the method
        int TotalSum = sum(number);
        //printing the output
        System.out.print("Sum: " + TotalSum);
    }
}
