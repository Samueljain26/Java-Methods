import java.util.*;
class Heights{

    public static int sum(int[] heights){
        int sum = 0;
        for(int a : heights){
            sum += a;
        }
        return sum;
    }

    public static int mean(int sum, int n){
        return sum/n;
    }
    public static int shortest(int[] heights){
        Arrays.sort(heights);
        return heights[0];
    }
    public static int tallest(int[] heights){
        Arrays.sort(heights);
        return heights[heights.length-1];
    }



    public static void main(String[] args) {
        int[] heights = new int[11];
        for(int i=0;i<heights.length;i++){
            heights[i] = (int) (Math.random() * 100) +150;
        }
        System.out.println("Heights: ");
        for(int i=0;i<heights.length;i++){
            System.out.println(heights[i]);
        }
        System.out.print("Sum: ");
        System.out.println(sum(heights));
        System.out.print("Mean: ");
        System.out.println(  mean(sum(heights), 11));
        System.out.print("Shortest height: ");
        System.out.println(shortest(heights));
        System.out.print("Tallest height: ");
        System.out.println(tallest(heights));
        } 
}