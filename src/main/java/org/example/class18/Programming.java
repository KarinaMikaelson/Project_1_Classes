package org.example.class18;
/*
Create a class named 'Programming: While creating an object of the class, if nothing is passed to it, then the message
"I love programming languages" should be printed. If some String is passed to it, then in place of "programming languages"
the value variable should be printed. Example, if we pass "Java", then "I love Java" should be printed.
 */
public class Programming {
    String value;
    public Programming(){
        this.value = "I love programming languages"; //Constructor with default message
    }

    public Programming(String value) {
        this.value = value;
    }

    public void printMessage(){
        System.out.println("I love "+value);
    }
}
class ProgrammingTester{
    public static void main(String[] args) {
        Programming defaultObj = new Programming();
        defaultObj.printMessage();
        Programming valueObj = new Programming("Java");
        valueObj.printMessage();
    }
}
