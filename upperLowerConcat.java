import java.util.Scanner;
public class upperLowerConcat {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a String:");
        String str = sc.nextLine();
        System.out.println("Lower case:"+str.toLowerCase());
        System.out.println("Upper case:"+str.toUpperCase());
        System.out.println("Enter a another string:");
        String str2 = sc.nextLine();
        String str3 = str+" "+str2;
        System.out.println("Concatenated String:"+str3);
    }
}
