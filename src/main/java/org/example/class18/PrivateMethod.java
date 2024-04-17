package org.example.class18;
/*
Create 1 class with a private method that has 3 overloaded forms.
Then call each overloaded method with specific arguments and observe result.
 */
public class PrivateMethod {
    private void displayMethod(String str){
        System.out.println(str.toUpperCase());
        System.out.println(1);
    }
    private void displayMethod(String str, int a){
        System.out.println(str.toUpperCase()+" "+a);
        System.out.println(2);
    }
    private void displayMethod(String str, int a, int b){
        System.out.println(str+" "+a+" times in "+b+" code");
        System.out.println(3);
    }
    public void callMethods(){
        displayMethod("This is the first method");
        displayMethod("This is a method number ",2);
        displayMethod("This method used ",3,1);
    }
}
class PrivateMethodTester{
    public static void main(String[] args) {
        PrivateMethod instance = new PrivateMethod();
        instance.callMethods();
    }
}

