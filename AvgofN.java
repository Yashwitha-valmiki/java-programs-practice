import java.util.Scanner;

public class AvgofN {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter value of n:");
        int N = sc.nextInt();
        int sum = 0;
        double avg;
        for(int i = 0; i<=N;i++){
            sum += i;
        } 
        avg = sum/N;
        System.out.println("Average value of N numbers: "+avg);
    }
}
