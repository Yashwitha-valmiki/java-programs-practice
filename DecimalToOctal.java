import java.util.Scanner;
public class DecimalToOctal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number:");
        int num = sc.nextInt();
        String octal = "0";
        int n = num;
        if (n==0) octal = "0";
        while(n>0){
            octal = (n%8)+octal;
            n = n/8;
        }

        System.out.println("Octal number of "+num+" is : "+octal);



        
    }
}
