import java.util.Scanner;

public class Average{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        // print numbers from 1 to 10
        // for(int i = 1;i<=10; i++){
        //     System.out.print(i + " ");
        // program to print odd numbers from 1 to 20
        // for(int i = 1; i<=20;i++){
        //     if(i%2!=0){
        //         System.out.print(i + " ");
        //     }
        // }

        // print even numbers from 1 to 20
        // for(int i = 1;i<=20;i++){
        //     if(i%2==0){
        //         System.out.print(i+" ");
        //     }
        // }
        // // sum of even numbers from 1 to n;
        // System.out.println("Enter number:");
        // int n = sc.nextInt();
        // int sum = 0;
        // for(int i =1;i<=n;i++){
        //     if(i%2==0){
        //         sum += i;
        //     }
        // }
        // System.out.println("Sum of N even numbers:"+sum);

        // sum of odd numbers from 1 to n
        // System.out.println("Enter number:");
        // int n = sc.nextInt();
        // int sum = 0;
        // for(int i = 1; i<=n;i++){
        //     if(i%2!=0){
        //         sum += i;
        //     }
        // }
        // System.out.println("Sum of N odd numbers:"+ sum);

        // print multiples of 5 upto 50
        // for(int i = 5; i<=50;i++){
        //     if(i%5==0){
        //         System.out.print(i+ " ");

        //     }
        // }

        //multiplication table in reverse order
        System.out.println("Enter number:");
        int n = sc.nextInt();
        for(int i = 10; i>=1;i--){
            System.out.println(n + " X " + i+" = "+n*i);
        }
     }
}
