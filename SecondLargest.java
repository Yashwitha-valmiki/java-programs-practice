import java.util.Scanner;
public class SecondLargest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of array:");
        int n = sc.nextInt();
        int[] a = new int[n];
        int largest = a[0];
        int smax = 0;
        System.out.println("Enter array elements:");
        for(int i=0;i<n;i++){
            a[i]=sc.nextInt();
        }

        for(int i=0;i<n;i++){
            if(a[i]>largest){
                smax = largest;
                largest = a[i];
            }
            else if((a[i]>smax) && a[i]!=largest){
                smax = a[i];
            }
        }

        System.out.println("Second largest element:"+smax);
    }
    
}
