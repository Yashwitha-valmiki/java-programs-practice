import java.util.Scanner;
public class PerfectInRange {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter starting and ending index:");
        int start = sc.nextInt();
        int end = sc.nextInt();
        System.out.println("Perfect numbers in range:");
        for(int num = start;num<=end;num++){
            int sum = 0;
            for(int i =1;i<num/2;i++){
                if(num%i==0) sum +=i;
                

            if(sum==num) System.out.print(num+" ");
               
            }
        }
    }
    
}
