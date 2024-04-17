package org.example.class18;
/*
Method Overloading concept
println method which we always use - is always Overloaded
 */
public class Calculator {
    public void add(int a, int b){
        System.out.println(a+b);
        System.out.println(1);
    }
    public void add(double a, double b){
        System.out.println(a+b);
        System.out.println(2);
    }
    public void add(long a, long b){
        System.out.println(a+b);
        System.out.println(3);
    }
    public void add(int a, int b, int c){
        System.out.println(a+b);
        System.out.println(4);
    }
    public void add(int a, double b){
        System.out.println(a+b);
        System.out.println(5);
    }
    public void add(double a, int b){
        System.out.println(a+b);
        System.out.println(6);
    }
}
class CalculatorTester{
    public static void main(String[] args) {
        Calculator c = new Calculator();
        c.add(10.5,34.3);
    }
}
