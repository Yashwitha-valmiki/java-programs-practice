interface Shape{
    void calculateArea();
}
class Circle implements Shape{
    int radius=5;
    double pi=3.14;
    double area;
    public void calculateArea(){
        area=pi*radius*radius;
        System.out.println("Area of circle:" +area);
    }
}
class Triangle implements Shape{
    int base=10;
    int height=5;
    double area;
    public void calculateArea(){
        area=0.5*base*height;
        System.out.println("area of triangle:" +area);
    }
}
public class InterfaceExample {
 public static void main(String[] args) {
    Shape myCircle=new Circle();
    myCircle.calculateArea();
    Shape myTriangle=new Triangle();
    myTriangle.calculateArea();
 }   
}
