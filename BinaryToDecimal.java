import java.util.Scanner;
public class BinaryToDecimal {
    public static void main(String[] args) {
        // Scanner sc = new Scanner(System.in);
        // System.out.println("Enter a binary number(0/1:");
        // String binary = sc.nextLine();
        // int decimal = Integer.parseInt(binary, 2);
        // System.out.println("Decimal number of "+binary+" = "+decimal);

        // Octal to decimal
        // Scanner sc = new Scanner(System.in);
        // System.out.println("Enter a octal number:");
        // String octal = sc.nextLine();
        // int decimal = Integer.parseInt(octal, 8);
        // System.out.println("Decimal number "+octal+" = "+decimal);


        //hexadecimal to decimal
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a decimal number:");
        String hexa = sc.nextLine();
        int decimal = Integer.parseInt(hexa, 16);
        System.out.println("Decimal number "+hexa+" = "+decimal);
    }
}
