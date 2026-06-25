import java.util.Scanner;

public class MultipleCatchBlock {
    public static void main(String[] args) {
        // try {
        //     int[] a = new int[5];
        //     a[5] = 10/0;
        //     System.out.println(a[10]);
        //     String s = null;
        //     System.out.println(s.length());

        // }
        // catch (ArithmeticException e) {
        //     System.out.println("Exception message:"+e);
        // }
        // catch(ArrayIndexOutOfBoundsException e){
        //     System.out.println("Exception message:"+e);
        // }
        // catch(NullPointerException e){
        //     System.out.println("Exception message:"+e);
        // }
        // catch(Exception e){
        //     System.out.println("Generic Exception"+e);
        // }
        // finally{
        //     System.out.println("Execution completed.");
        // }
        try {
            Scanner sc = new Scanner(System.in);
            int n = sc.nextInt();
            int[] num = new int[n];
            for(int i =0; i<n-1;i++){
                num[i] = sc.nextInt();
            }
            for(int i = 0; i<num.length;i++){
                System.out.println(num[i]);

            }
            int index = sc.nextInt();
            System.out.println(num[index]);
            
            
        }
        catch (ArrayIndexOutOfBoundsException e) {
            System.out.println(e);
        }
        finally{
            System.out.println("Execution completed.");
        }
    }
    
}
