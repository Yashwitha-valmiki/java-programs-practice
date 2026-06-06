import java.util.Scanner;
public class DecimalToBinary {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a decimal:");
        // int num = sc.nextInt();
        // String binary = "";
        // int n = num;
        // if(n==0) binary="0";
        // while(n>0){
        //     binary = (n%2)+binary;
        //     n = n/2;
        // }
        int num = sc.nextInt();
        String binary =" ";
        int n = num;
        if(n==0) binary="0";
        while(n>0){
            binary = (n%2)+binary;
            n = n/2;
        }

        System.out.println("Binary of "+num+" is : "+binary);

    }
    
}
