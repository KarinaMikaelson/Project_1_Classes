package org.example.class17;
/*
Java will choose local var
- Use THIS to specify from which class to use action
- Super - to use from parent class
 */
public class Furninure {
    String color = "Black";
}
class Chair extends Furninure{
    String color = "White";
    void printColor(){
        String color = "Purple";
        System.out.println(super.color);
    }
}
class FurTester{
    public static void main(String[] args) {
        Chair chair = new Chair();
        chair.printColor();
    }
}