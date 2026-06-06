import java.util.Scanner;

class Student{
    String name;
    void display(){
        System.out.println("Name: "+name);
    }
}
public class MainClass123 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // System.out.println("Enter a name:");
        Student s1 = new Student();
        s1.name = "Bob";
        s1.display();


    }
    
}
