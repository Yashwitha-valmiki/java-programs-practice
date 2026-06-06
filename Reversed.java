import java.util.Scanner;

public class Reversed {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of original number:");
        int original = sc.nextInt();
        int num;
        num = original;
        int rev = 0;
        // while(num!=0){
        //     rev = rev*10+num%10;
        //     num = num/10;
        // }
        while(num!=0){
            rev = rev*10+num%10;
            num = num/10;
        }
        System.out.println("Reversed number is:" + rev);
    }
}
