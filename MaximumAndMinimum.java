import java.util.Scanner;
public class MaximumAndMinimum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a, b;
        System.out.println("Enter two numbers:");
        a = sc.nextInt();
        b = sc.nextInt();
        // to show minimum of two numbers
        if(a<b){
            System.out.println(a + " is smaller than " + b);
        }
        else{
            System.out.println(b + " is smaller than "+ a);
        }

        // to show maximum of two numbers
        int c,d;
        System.out.println("Enter the value of two numbers:");
        c = sc.nextInt();
        d = sc.nextInt();
        if(c>d){
            System.out.println(c + " is greater than "+ d);

        }
        else{
            System.out.println(d + " is greater than "+c);
        }

    }
    
}
