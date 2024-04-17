package org.example.class18;
/*
Create 1 class with a static method that has 3 overloaded forms.
Then call each overloaded method with specific arguments and observe result.
 */
public class OverloadedMethod {
    public static void printMessage(String str){
        System.out.println(str);
        System.out.println(1);
    }
    public static void printMessage(String str, int a){
        System.out.println(str+" "+a);
        System.out.println(2);
    }
    public static void printMessage(String str, int a, double b){
        System.out.println(str+" "+a+" "+b);
        System.out.println(3);
    }
}
class OverloadedMethodTester{
    public static void main(String[] args) {
        OverloadedMethod obj1 = new OverloadedMethod();
        obj1.printMessage("Hello");
        OverloadedMethod obj2 = new OverloadedMethod();
        obj2.printMessage("Good afternoon",4);
        OverloadedMethod obj3 = new OverloadedMethod();
        obj3.printMessage("Bye",8,12.23);
    }
}
