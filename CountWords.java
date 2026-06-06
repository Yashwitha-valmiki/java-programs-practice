import java.util.Scanner;
public class CountWords {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a String:");
        String str = sc.nextLine();
        // String[] words = str.trim().split("\\s+");
        // System.out.println("Number of words: "+words.length);

        // String result = str.replace(" ", "");
        // System.out.println("String after removing spaces: "+ result);

        // Number of characters
        System.out.println("Number of Characters: "+str.length());
    }
}
