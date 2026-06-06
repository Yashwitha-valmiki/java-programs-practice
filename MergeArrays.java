import java.util.Scanner;

public class MergeArrays {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the arrays:");
        int n1=sc.nextInt();
        int n2=sc.nextInt();
        int[] a = new int[n1];
        int[] b = new int[n2];
        System.out.println("Enter first array elements:");
        for(int i=0;i<n1;i++){
            a[i]=sc.nextInt();
        }
        System.out.println("Enter second array elements:");
        for(int i=0;i<n2;i++){
            b[i]=sc.nextInt();
        }

        int[] c = new int[n1+n2];
        for(int i=0;i<n1;i++){
            c[i]=a[i];
        }
        for(int i=0;i<n2;i++){
            c[n1+i]=b[i];
        }

        System.out.println("Merged array:");
        for(int i=0;i<n1+n2;i++){
            System.out.print(c[i]+" ");
        }
        
    }
    
}
