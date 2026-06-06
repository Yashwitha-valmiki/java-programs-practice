import java.util.Scanner;
public class Symmetric {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter rows and cols:");
        int rows = sc.nextInt();
        int cols = sc.nextInt();
        int[][] arr = new int[rows][cols];
        int[][] t = new int[cols][rows];
        System.out.println("Enter array elements:");
        for(int i=0;i<rows;i++){
            for(int j=0;j<cols;j++){
                arr[i][j] = sc.nextInt();
            }
        }

        System.out.println("Enter a number to count:");
        int num = sc.nextInt();
        int cnt = 0;

        System.out.println("Count of "+num+" is "+cnt);
    }


        // boolean isSymmetric = true;

        // System.out.println("Check for symmetric:");
        // for(int i=0;i<rows;i++){
        //     for(int j=0;j<cols;j++){
        //         if(arr[i][j] != arr[j][i]){
        //             isSymmetric = false;
        //             break;
        //         }
        //     }
        // }

        // if(isSymmetric){
        //     System.out.println("Given matrix is symmetric");
        // }
        // else{
        //     System.out.println("Given matrix is Asymmetric");
        // }
    }
    

