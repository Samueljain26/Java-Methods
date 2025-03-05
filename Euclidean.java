import java.util.*;

public class Euclidean 
{
    static double FindDistance(double x1,double x2, double y1, double y2){
        double distance = Math.sqrt(Math.pow(x2-x1,2)) + Math.sqrt(Math.pow(y2-y1,2));
        return  distance;
    }
    static double[] FindEquation(double x1,double x2, double y1, double y2){
        double m = (y2-y1)/(x2-x1);
       double b = y1 - (m*x1);
       double eq1 = m*x1 + b;
       double eq2 = m*x2 + b;
  return new double[]{m, b, eq1, eq2};
    }
    public static void main(String[] args){
        Scanner sc =new Scanner(System.in);
        System.out.print("Enter the coordinates of 1st point: ");
        System.out.println("x1: ");
        double x1 = sc.nextDouble();
        System.out.println("y1: ");
        double y1 = sc.nextDouble();
        System.out.print("Enter the coordinates of 2nd point: ");
        System.out.println("x2: ");
        double x2 = sc.nextDouble();
        System.out.println("y2: ");
        double y2 = sc.nextDouble();

    System.out.print("Distance: " +FindDistance(x1,x2,y1,y2));
    double[] arr = FindEquation(x1,x2,y1,y2);
    System.out.println("Slope: " + arr[0]);
    System.out.println("Y-intercept: " + arr[1]);
    System.out.println("Equation-1: " + arr[2]);
    System.out.println("Equation-2: " + arr[3]);
}
}
