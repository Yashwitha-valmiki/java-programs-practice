import java.util.Scanner;

public class DecimalToHexaDecimal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number:");
        int num = sc.nextInt();
        // String hex = Integer.toHexString(num).toUpperCase();
        // System.out.println("Hexadecimal of "+num +" is : "+ hex);

        String hex = Integer.toHexString(num).toUpperCase();
        System.out.println("Hexadecimal of "+num+" is :"+hex);

    }
    
}
