// 7. Write a Java program demonstrating the use of super() to call the parent class
// constructor and access parent class variables
class Parent{
    String message = "This is a parent class variable.";
    Parent(){
        System.out.println("This is parent class constructor.");
    }
}

class Child extends Parent{
    String message = "This is a child class variable.";
    Child(){
        super();
        System.out.println("This is Child class constructor.");
    }

    void display(){
        System.out.println('\n');
        System.out.println(message);
        System.out.println(super.message);
    }
}

public class Super_keyword {
    public static void main(String[] args) {
        
        Child c1 = new Child();
        c1.display();
    }
    
    
}
