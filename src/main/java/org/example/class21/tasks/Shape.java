package org.example.class21.tasks;
/*
Create an Interface 'Shape' with undefined methods as calculateArea and
calculatePerimiter. Create 2 classes Circle & Square that implements functionality defined in the Shape Interface.
Test your code.
 */
public interface Shape {
    double calculateArea();
    double calculatePerimeter();
}
class Circle implements Shape{
    private double radius;
    public Circle(double radius){
        this.radius = radius;
    }
    @Override
    public double calculateArea(){
        return Math.PI * (radius * radius);
    }
    @Override
    public double calculatePerimeter(){
        return 2 * Math.PI * radius;
    }
}
class Square implements Shape{
    private double side;
    public Square(double side){
        this.side = side;
    }
    @Override
    public double calculateArea(){
        return side * side;
    }
    @Override
    public double calculatePerimeter(){
        return 4 * side;
    }
}
class ShapeTester{
    public static void main(String[] args) {
        Circle circle = new Circle(5);
        System.out.println(circle.calculateArea());
        System.out.println(circle.calculatePerimeter());

        Square square = new Square(4);
        System.out.println(square.calculateArea());
        System.out.println(square.calculatePerimeter());
    }
}