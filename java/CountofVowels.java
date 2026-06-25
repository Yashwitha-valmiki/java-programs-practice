//2. Write a Java program to count the number of vowels and consonants in a given string.
import java.util.Scanner;

public class CountofVowels {
    public static void main(String[] args) {
        // write a java program to count number of vowels and consonants in given string
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string:");
        String str = sc.nextLine();
        int vowels =0;
        int consonants = 0;
        for(int i =0; i<str.length();i++){
            char ch = str.charAt(i);
            if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u'){
                vowels++;
            }
            else{
                consonants++;
            }
        
        }

        System.out.println("Original String: "+str);
        System.out.println("Number of vowels: "+vowels);
        System.out.println("Number of consonants: "+consonants);
    }
}
    

