import java.util.*;

public class SpringSeason {
    // Method to check if the given date falls in the Spring season
    public static boolean isSpringSeason(int month, int day) {
        if ((month == 3 && day >= 20) ||
            (month == 4 ) ||
            (month == 5 ) ||
            (month == 6 && day >= 1 && day <= 20)) { // June 1 - June 20
            return true;
        } else {
            return false;
        }
    }

    public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.print("Enter the month: ");
	int month =sc.nextInt();
	System.out.print("Enter the date: ");
	int day =sc.nextInt();
	boolean spring =isSpringSeason(month,day);
	if(spring ==true){
	System.out.print("Is Spring Season");
	}
	else{
	System.out.print("Is not a spring season");
}}
}
