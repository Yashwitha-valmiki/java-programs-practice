import java.util.Scanner;
public class Function {
    static boolean isPalindrome(int num){
        int rev = 0;
        int n = num;
        while(n!=0){
            int rem = n%10;
            rev = rev*10+rem;
            n = n/10;
        }
        return rev==num;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number:");
        int num = sc.nextInt();
        if(isPalindrome(num)){
            System.out.println(num+" is a Palindrome");
        }
        else{
            System.out.println(num+" is not a palindrome.");
        }
    }
    
}
