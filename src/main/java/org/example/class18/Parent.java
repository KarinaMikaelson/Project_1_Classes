package org.example.class18;
/*
Super Keyword - if you don't have a conflict, you doo not need super keyword, when u want to use parent class var
this keyword - when we want to use instance var
name - when you want tp use  local var
- if delete local and instance var, it will only give us parent
 */
public class Parent {
    String name = "Jack";
}
class Child extends Parent{
    //String name = "Taras";
    void printName(){
        //String name = "Sam";
        System.out.println(name);
        System.out.println(this.name);
        System.out.println(super.name);
    }
}
class ParentTester{
    public static void main(String[] args) {
        Child c = new Child();
        c.printName();
    }

}
