package org.example.class24.Tasks;

import java.util.LinkedList;
import java.util.List;

/*
ArrayList/LinkedList

Create a Cat class create 3 fields a constructor and printInfo method inside it.
Create three objects from this class store them inside the Linkedlist and call printInfo
method using these three objects.
 */
public class Task1 {
    public static void main(String[] args) {
        List<Cat> cats = new LinkedList<>(); //Data type of cats is List ( list of cats)
        Cat cat1 = new Cat("Loki","Black",5);
        Cat cat2 = new Cat("Milo","Brown",7);
        Cat cat3 = new Cat("Spooky", "White",8); // We created the objects

        cats.add(cat1); // We are adding this objects
        cats.add(cat2);
        cats.add(cat3);

        //Lambda
        cats.forEach(x ->x.printInfo());

        /*
        for(Cat cat:cats){
           cat.printInfo();
        }
         */

    }
}
class Cat{
    private String name;
    private String color;
    private int age;
    Cat(String name, String color , int age){
        this.name = name;
        this.color = color;
        this.age = age;
    }
    public void printInfo(){
        System.out.println(name+" "+color+" "+age);
    }
}
