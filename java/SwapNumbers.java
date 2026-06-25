// 1. Write a Java program to swap two numbers using and without using a third
// variable.


public class SwapNumbers {
    public static void main(String[] args){
        int a = 10;
        int b = 20;
        System.out.println("Swapping two numbers with using third varible.");
        System.out.println("Before Swapping:"+"a: "+a+", "+"b:"+b);
        int temp = a;
        a = b;
        b = a;
        System.out.println("After Swapping:"+"a: "+ a+",  " +"b: "+b);
        // without third variable
        int x = 30;
        int y = 40;
        System.out.println("Before swapping:"+"x: "+x+", "+"y: "+y);
        x = x+y;
        y = x-y;
        x = x-y;
        System.out.println("After swapping:"+"x: "+x+", "+"y:"+y);
    }
}
