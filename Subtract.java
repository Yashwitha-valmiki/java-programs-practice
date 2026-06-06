import java.util.Scanner;

public class Subtract {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter two numbers:");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int diff = a-b;
        System.out.println("Difference of two numbers:" + diff);
    }
}


