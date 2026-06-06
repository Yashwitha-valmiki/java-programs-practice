import java.util.Scanner;
public class SumofDigitsRecursion {
    static int SumofDigits(int n){
        if(n==0){
            return 0;
        }
        else{
            return n%10+SumofDigits(n/10);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number:");
        int n = sc.nextInt();
        System.out.println("Sum of Digits: "+ SumofDigits(n));

    }
    
}
