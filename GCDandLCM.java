import java.util.Scanner;
public class GCDandLCM {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter two numbers:");
        int a = sc.nextInt();
        int b = sc.nextInt();
        // while(b!=0){
        //     int temp = b;
        //     b = a%b;
        //     a = temp;
        // }

        // while(b!=0){
        //     int temp = b;
        //     b = a%b;
        //     a = temp;
        // }

        // System.out.println("GCD of "+a+", "+b+" is "+a);

        int lcm = (a>b)? a:b;
        while (true) { 
            if(lcm%a==0 && lcm%b==0){
                break;
            }
            
            lcm +=1;
        }

        System.out.println(lcm);
    }
    
}
