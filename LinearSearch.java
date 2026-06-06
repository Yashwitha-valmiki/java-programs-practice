import java.util.Scanner;

public class LinearSearch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size of an array:");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter array elements:");
        for (int idx = 0; idx < arr.length; idx++) {
            arr[idx] = sc.nextInt();
        }
        // System.out.println("Enter a key to search:");
        // int key = sc.nextInt();
        // for (int idx = 0; idx < arr.length; idx++) {
        //     if(arr[idx]==key){
        //         System.out.println(key+" is found at index "+idx);
        //         break;
        //     }
        // }

        for(int i=0;i<n;i++){
            for(int j=0;j<n-i-1;j++){
                if(arr[j]>arr[j+1]){
                    int temp = arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
            }
        }

        System.out.println("Sorted array:");
        for(int i=0;i<n;i++){
            System.out.print(arr[i]+" ");
        }
    }

}


    

