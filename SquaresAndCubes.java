import java.util.Scanner;

public class SquaresAndCubes {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int i=1;i<=n;i++){
            System.out.println("Square of "+i+" = "+(i*i));
        }
        for(int i = 1;i<=n;i++){
            System.out.println("Cube of "+i+" = "+(i*i*i));
        }
        
    }
}
    

