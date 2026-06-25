interface AddOperations{
    int add(int a, int b);
}

interface MultiplyOperation{
    int multiply(int a, int b);
}

class Calculator implements AddOperations, MultiplyOperation{
    @Override
    public int add(int a, int b){
        return a+b;
    }
    @Override
    public int multiply(int a, int b){
        return a*b;
    }
}

public class Interface_MultipleInheritance {
    public static void main(String[] args) {
        Calculator calc = new Calculator();
        System.out.println("Result of addition:"+calc.add(10, 6));
        System.out.println("Result of multiplication:"+calc.multiply(10, 6));
    }
    
}
