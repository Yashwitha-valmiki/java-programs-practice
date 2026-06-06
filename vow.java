import java.util.Scanner;
public class vow {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a String:");
        String str = sc.nextLine();
        int vow = 0;
        int con = 0;
        int space = 0;
        for(int i =0;i<str.length();i++){
            char ch = Character.toLowerCase(str.charAt(i));
            if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u'){
                vow +=1;
            }
            else if(ch>='a'&& ch<='z'&&(ch!='a'||ch!='e'||ch!='i'||ch!='o'||ch!='u')){
                con += 1;
            }
            else{
                space += 1;
            }
        }
        System.out.println("Number of vowels: "+vow);
        System.out.println("Number of consonants: "+con);
        System.out.println("Number of spaces:"+space);
    }
}
    

