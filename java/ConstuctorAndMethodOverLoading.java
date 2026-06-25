// 5. Write a Java program to overload constructors and methods in the same class (combined
// demonstration).

class demo{
    demo(){
        System.out.println("Default Constructor is called:");
    }
    demo(int a){
        System.out.println("Parameterized constructor with one integer Called: "+ a);
    }
    demo(int a, int b){
        System.out.println("Parameterized constructor with two integers: "+ a + b);
    }
    
    public int add(int a, int b){
        return a+b;
    }
    public double add(double a, double b){
        return a+b;
    }
}


public class ConstuctorAndMethodOverLoading {
    public static void main(String[] args) {
        demo d1 = new demo();
        demo d2 = new demo(10);
        demo d3 = new demo(20, 30);

        System.out.println("Calling method over loading.");
        System.out.println("Addition of two integers:"+d1.add(10, 7));
        System.out.println("Adding two doubles:"+d1.add(10.6, 6.7));
    }
}
