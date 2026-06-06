import java.util.Scanner;

public class Positive {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size of an array:");
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }

        int pos=0;
        int neg=0;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]>0){
                pos++;
            }
            else if(arr[i]<0){
                neg++;
            }
    }   
    System.out.println("Number of positive numbers:"+pos);
    System.out.println("Number of negative numbers:"+neg);
}
}
    

