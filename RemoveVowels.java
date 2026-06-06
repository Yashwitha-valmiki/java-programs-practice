import java.util.Scanner;
public class RemoveVowels {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string: ");
        String str = sc.nextLine();
        System.out.println("Original String: "+str);
        String replace = str.replaceAll("[aeiouAEIOU]", "");
        System.out.println("Replaced String: "+replace);

    }
    
}
