import java.util.Scanner;
public class LargestElement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of array:");
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i =0;i<n;i++){
            arr[i]=sc.nextInt();
        }

        int largest = 0;
        for(int i=0;i<n;i++){
            if(arr[i]>largest){
                largest = arr[i];
            }
        }

        System.out.println("Largest element in the array:"+largest);
        int smallest = arr[0];
        for(int i=0;i<n;i++){
            if(arr[i]<smallest){
                smallest = arr[i];
            }
        }
        System.out.println("Smallest element in the array:"+smallest);

        int sum = 0;
        for(int i =0;i<n;i++){
            sum += arr[i];
        }

        System.out.println("Sum of elements in the array:"+sum);

        double avg = sum/n;
        System.out.println("Average of the array:"+avg);
    
}
}
