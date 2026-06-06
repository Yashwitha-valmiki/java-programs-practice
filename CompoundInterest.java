import java.util.Scanner;
public class CompoundInterest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter principle amount: ");
        double p = sc.nextDouble();
        System.out.println("Enter rate of Interest: ");
        double r = sc.nextDouble();
        System.out.println("Enter time in Years: ");
        double t = sc.nextDouble();
        System.out.println("Enter number of times Interest applied per year: ");
        double n = sc.nextDouble();
        // double A = p*(Math.pow((1+r/n*100), n*t));
        double ci = p*Math.pow(1+(r/100*n), n*t)-p;
        System.out.println("Compound Interest: "+ci);

    }
    
}
