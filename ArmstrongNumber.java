import java.util.Scanner;

public class ArmstrongNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // System.out.println("Enter a number:");
        // int original = sc.nextInt();
        // int num;
        // num = original;
        // double sum = 0;
        // while(num!=0){
        //     int rem = num%10;
        //     sum += rem*rem*rem;
        //     num = num/10;
        // }

        // if(sum == original){
        //     System.out.print(original + "  is a ArmStrong number. ");
        // }
        // else{
        //     System.out.print(original +" is not a Armstrong number." );
        // }


        // int count = 0;
        // num = original;
        // while(num!=0){
        //     int rem = num%10;
        //     count += 1;
        //     num = num/10;
        // }

        // while(num!=0){
        //     int digit = num%10;
        //     sum = sum + Math.pow(digit, count);
        //     num = num/10;
        // }
        
        // if(sum == original){
        //     System.out.println(original+"Given number is a armstrong.");
        // }
        // else{
        //     System.out.println(original+"Given number is not a Armstrong number.");
        // }

        // for(int i = 100; i<=999; i++){
        //     int original;
        //     original = i;
        //     while(i!=0){
        //         int rem = i%10;
        //         sum += rem*rem*rem;
        //         i = i/10;
        //     }

        //     if(sum == original){
        //         System.out.print(sum + "  ");
        //     }
        // }

    

        // // Area of Triangle using herons formula
        // System.out.println("Enter first side:");
        // double a = sc.nextDouble();
        // System.out.println("Enter second number:");
        // double b = sc.nextDouble();
        // System.out.println("Enter Third number:");
        // double c = sc.nextDouble();
        // double s = (a+b+c)/2;
        // double area = Math.sqrt(s*(s-a)*(s-b)*(s-c));
        // System.out.println("Area of Triangle using heron's formula:"+area);
        System.out.println("Enter a number:");
        int year = sc.nextInt();
        if((year%4==0)&&(year%100!=0) || (year%400==0)){
            System.out.println(year+" is a leap year.");
        }
        else{
            System.out.println(year + " is not a leap year.");
        }
    }
    
}

