// program to calculate power of a given number.
// program to calculate power of a given number
import java.util.Scanner;

public class power {
    // public static void main(String[] args) {
    //     Scanner sc = new Scanner(System.in);
    //     System.out.println("Enter a base:");
    //     int base = sc.nextInt();
    //     System.out.println("Enter a exponent:");
    //     int exp = sc.nextInt();
    //     int result = 1;
    //     for(int i =1;i<=exp;i++){
    //         result *= base;
    //     }
    //     System.out.println(base +" ^ "+exp+" = "+ result);
    // }

    // program to squares of first N natural numbers
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number:");
        int N = sc.nextInt();
        for(int i = 1; i<=N;i++){
            System.out.println(i+" Square is = "+i*i);
        }
    }
    
}
