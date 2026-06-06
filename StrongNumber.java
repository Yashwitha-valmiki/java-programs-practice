import java.util.Scanner;
public class StrongNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number:");
        int ori = sc.nextInt();
        int n = ori;
        int sum = 0;
        int fact = 1;
        while(n!=0){
            int digit = n%10;
            for(int i=1;i<=digit;i++){
                fact *= i;
            }
            sum += fact;
            n = n/10;
        }

        if(ori==sum){
            System.out.println(ori+" is a Strong Number.");
        }
        else{
            System.out.println(ori+" is not a Strong Number.");
        }
    }
    
}
