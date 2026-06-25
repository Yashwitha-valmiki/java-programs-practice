// 6. Write a Java program to implement hierarchical inheritance.
// Hierarchial Inheritance
class MathOperations{
    int num1;
    int num2;
    
    void setData(int num1, int num2){
        this.num1 = num1;
        this.num2 = num2;
    }
}

class Add extends MathOperations{

    void add(){
        int sum = num1+num2;
        System.out.println("Addition:"+sum);
    }

}

class Multiply extends MathOperations{
    void multiply(){
        int product = num1*num1;
        System.out.println("Multiplication:"+product);

    }
}


public class HierarchialInheritance {
    public static void main(String[] args) {
        System.out.println("Demonstrating child 1 class");
        Add obj1 = new Add();
        obj1.setData(10, 40);
        obj1.add();
        System.out.println("Demonstrating child 2 class");
        Multiply obj2 = new Multiply();
        obj2.setData(45, 67);
        obj2.multiply();
    }
}
