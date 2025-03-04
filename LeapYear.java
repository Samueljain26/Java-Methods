import java.util.*;

public class LeapYear{
    //method to check if year is leap year or not
	public static boolean leap(int year) {
	    //conditions
		if(year%400==0){
		    return true;
		}
		else if(year%100 != 0 && year%4==0){
		    return true;
		}
		else{
		    return false;
		}
	}
	
	public static void main(String[] args){
	    Scanner sc =new Scanner(System.in);
	    //taking user input
	    System.out.print("Enter the year: ");
	    int year =sc.nextInt();
	    //calling the method
	    boolean ifLeapYear =leap(year);
	    //printing the output
	    if(ifLeapYear==true){
	        System.out.print(year + " is leap year.");
	    }
	        else{
	        System.out.print(year + " is not leap year.");
	    }
	}
}


