import java.util.Scanner;
public class SumOfDiagonal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter rows and columns:");
        int rows = sc.nextInt();
        int cols = sc.nextInt();
        int[][] arr = new int[rows][cols];
        System.out.println("Enter matrix elements:");
        for(int i=0;i<rows;i++){
            for(int j=0;j<cols;j++){
                arr[i][j] = sc.nextInt();
            }
        }

        // int sum = 0;
        // for(int i=0;i<rows;i++){
        //     for(int j=0;j<cols;j++){
        //         if(i==j){
        //             sum += arr[i][j];
        //         }
        //     }
        // }

        // System.out.println("Sum of diagonal elements:"+sum);

        // int[][] t = new int[cols][rows];
        // for(int i=0;i<cols;i++){
        //     for(int j=0;j<rows;j++){
        //         t[j][i] = arr[i][j];
        //     }
        // }
        // System.out.println("Transpose of the given matrix:");

        // for(int i=0;i<cols;i++){
        //     for(int j=0;j<rows;j++){
        //         System.out.print(t[i][j]+" ");
        //     }
        //     System.out.println();
        // }

        // for(int i=0;i<rows;i++){
        //     int sum=0;
        //     for(int j=0;j<cols;j++){
        //         sum += arr[i][j];
        //         // System.out.println("Sum of "+i+" = "+sum);

        //     }
        //     System.out.println("Sum of "+i+" = "+sum);

        for(int j=0;j<cols;j++){
            int sum = 0;
            for(int i=0;i<rows;i++){
                sum += arr[i][j];
            }
            System.out.println("Sum of column "+j+" = "+sum);
        }

        }

    }
    

