import java.util.Scanner;

public class CelsiusToFahrenheit {
    public static void main(String[] args) {
        // // program to connvert celsius to fahrenheit
        // Scanner sc = new Scanner(System.in);
        // System.out.println("Enter value in temperature celsius:");
        // double f, c;
        // c = sc.nextDouble();
        // f = (1.8*c)+32;
        
        // System.out.println("Temperature of celsius to fahrenheit is:" + f);
        // program to convert fahrenheit to celsius
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter value of temperature in fahrenheit:");
        double f, c;
        f = sc.nextDouble();
        c = ((0.57)*(f-32));
        System.out.println("Temperature of fahreheit to celsius is:"+c);
    }
}
