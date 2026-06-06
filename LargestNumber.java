// largest number of three numbers
import java.util.Scanner;

class  LargestNumber{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter three numbers:");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int Largest = a;
        if (b>Largest) Largest = b;
        if (c>Largest) Largest = c;
        System.out.println("Largest number among three numbers:" + Largest);

    }
}