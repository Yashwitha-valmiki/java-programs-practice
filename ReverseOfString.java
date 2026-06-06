// //     public static void main(String[] args) {
// //         Scanner sc = new Scanner(System.in);
// //         System.out.println("Enter a string:");
// //         String originalString = sc.nextLine();
// //         String reversedString = "";
// //         for(int i = originalString.length()-1;i>=0;i++){
// //             reversedString = reversedString+originalString.charAt(i);
// //         }

// //         System.out.println("Original String:"+ originalString);
// //         System.out.println("Reversed String:"+reversedString);
// //      }
// // }
// import java.util.Scanner;
// public class ReverseOfString {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         System.out.println("Enter a string:");
//         String originalString = sc.next();
//         String reversedString = "";

//         // Iterate from the last character to the first
//         for (int i = originalString.length() - 1; i >= 0; i--) {
//             reversedString = reversedString + originalString.charAt(i);
//         }

//         System.out.println("Original String: " + originalString);
//         System.out.println("Reversed String: " + reversedString);
            
//         if(reversedString==originalString){
//             System.out.println("Entered String "+reversedString+"is a palindrome.");
//         }
//         else{
//             System.out.println("Entered String "+originalString+" is not a palindrome.");

//         }
//     }
// }



// // public class ReverseOfString{
// //     public static void main(String[] args) {
// //         Scanner sc = new Scanner(System.in);
// //         System.out.println("Enter a string:");
// //         String originalString = sc.next();
// //         String reversedString = "";
// //         for(int i = originalString.length()-1;i>=0;i++){
// //             reversedString = reversedString + originalString.charAt(i);
// //         }
// //         if(originalString == reversedString){
// //             System.out.println("Entered String "+reversedString+"is a palindrome.");
// //         }
// //         else{
// //             System.out.println("Entered String "+originalString+" is not a palindrome.");

// //         }
// //     }
// // }


import java.util.Scanner;
public class ReverseOfString{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string:");
        String original = sc.next();
        String OriginalString;
        OriginalString = original;
        String reversed = "";
        for(int i = original.length()-1;i>=0;i--){
            reversed = reversed+original.charAt(i);
        }
        System.out.println("Original String:"+ original);
        System.out.println("reversed string:"+reversed);
        if(OriginalString == reversed){
            System.out.println(original+" String is a palindrome.");
        }
        else{
            System.out.println(original+" String is not a palindrome.");
        }
    }
}