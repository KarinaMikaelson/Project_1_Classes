package org.example.class19;
/*
Overriding Method
 */
public class Parent {
    void marry(){
        System.out.println("Marry the girl we chose for you");
    }
}
class Alex extends Parent{
    void marry(){
        super.marry();
        System.out.println("I want to mary Taylor Swift");
    }
}
class ParentTester{
    public static void main(String[] args) {
        Alex alex = new Alex();
        alex.marry();
    }
}
