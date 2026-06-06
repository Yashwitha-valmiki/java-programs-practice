import java.util.Scanner;
public class CopyArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size of array:");
        int n = sc.nextInt();
        System.out.println("Enter array elements:");
        int[] arr = new int[n];
        // int[] arr1=new int[n];
        for (int idx = 0; idx < arr.length; idx++) {
            arr[idx]=sc.nextInt();
        }
        // int sum1 =0;
        // int sum2=0;

        // for(int i =0;i<n;i++){
        //     if(arr[i]%2==0){
        //         sum1 += arr[i];
        //     }
        //     else{
        //         sum2 += arr[i];
        //     }
            
            
        // }

        // System.out.println("Sum of even numbers in array:"+sum1);
        // System.out.println("Sum of odd numbers in array:"+sum2);
            
        // }
        // System.out.println("Array1 elements:");

        // for(int i =0;i<n;i++){
        //     System.out.print(arr[i]+" ");

        // }

        // for(int i=0;i<arr.length;i++){
        //     arr1[i] = arr[i];
        // }
        // System.out.println("Copied elements:");
        // for(int i =0;i<n;i++){
        //     System.out.print(arr1[i]+" ");

        // }

        // System.out.println("Array elements:"+arr1);
        int even = 0;
        int odd = 0;
        for(int i=0;i<n;i++){
            if(arr[i]%2==0){
                even+=1;
            }
            else{
                odd+=1;
            }
        }

        System.out.println("Number of even:"+even);
        System.out.println("Number of odd:"+odd);
    
}
}
    

