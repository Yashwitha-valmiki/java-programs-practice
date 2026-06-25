// 8. Write a Java program with a base class Shape having a method calculateArea().
// Create subclasses Circle, Square, and Rectangle, each overriding the method to
// compute the respective areas.


class Shape{
    void calculateArea(){
        System.out.println("Area Calculation not defined for generic methods.");
    }
}

class Circle extends Shape{
    double radius = 5.6;
    @Override
    void calculateArea(){
        double area = Math.PI*radius*radius;
        System.out.println("Area of circle:"+area);
    }
}
class Square extends Shape{
    double side = 46.5;
    @Override
    void calculateArea(){
        double area = side*side;
        System.out.println("Area of square:"+area);
    }
}

class Rectangle extends Shape{
    double length = 6.7;
    double width = 7.8;
    @Override
    void calculateArea(){
        double area = length*width;
        System.out.println("Area of Rectangle:"+area);
    }
}


public class MethodOverriding {
    public static void main(String[] args) {
        // Circle c1 = new Circle();
        Shape c1 = new Circle();
        c1.calculateArea();
        // Square s1 = new Square();
        Shape s1 = new Square();
        s1.calculateArea();
        // Rectangle r1 = new Rectangle();
        Shape r1 = new Rectangle();
        r1.calculateArea();


    }
    
}
