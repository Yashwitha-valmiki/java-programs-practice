import java.util.Scanner;
public class Euler {
    public static void main(String[] args) {
        // System.out.println("Euler's constant:"+Math.E);
        // System.out.println("Square of Euler's constant: "+Math.pow(Math.E, 2));r:
        // area of circle
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter radius:");
        int r = sc.nextInt();
        double area  = Math.PI*r*r;
        System.out.println("Area of circle: "+area);
    }
    
}
