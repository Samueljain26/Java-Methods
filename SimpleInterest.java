import java.util.*;

public class SimpleInterest{
	//making method
    static double getInterest(double principal,double rate,int time){
        double interest = principal*rate*time;
        return interest;
    }
	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		//taking the input
		System.out.print("Enter the principal amount: ");
		double principal =sc.nextDouble();
		System.out.print("Enter the Rate of interest: ");
		double rate =sc.nextDouble();
		System.out.print("Enter the Time Period: ");
		int time =sc.nextInt();
		//calling the method made above
		double interest = SimpleInterest.getInterest(principal,rate,time);
		//printing the output
		System.out.print("Simple Interest: " + interest);
	}
}
