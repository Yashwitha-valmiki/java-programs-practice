import java.util.Scanner;
public class MathClass {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number:");
        // int n = sc.nextInt();
        // System.out.println("Absolute value of "+n+" : "+Math.abs(n));
        // System.out.println("Square root of "+n+" : "+Math.sqrt(n)); 
        // System.out.println("Power of "+n+" : "+Math.pow(n, 2));
        // System.out.println("Enter a number: ");
        // int b = sc.nextInt();
        // // System.out.println("Maximum of "+n+", "+b+" :"+Math.max(n, b));
        // System.out.println("Minimum of "+n+", "+b+": "+Math.min(n, b));

        double n = sc.nextDouble();
        // System.out.println("Roundoff of "+n+" : "+Math.round(n));
        // System.out.println("Math ceil : "+Math.ceil(n));
        System.out.println("Floor value of number: "+Math.floor(n));
    }
}
