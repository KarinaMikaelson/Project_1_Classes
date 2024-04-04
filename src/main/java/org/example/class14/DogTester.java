package org.example.class14;

public class DogTester {
    public static void main(String[] args) {
        Dog d1 = new Dog();
        d1.name = "Jacky";
        d1.age = 12;
        d1.color = "Black";   // instance var

        Dog d2 = new Dog();
        d2.name ="Lao";
        d2.age = 3;
        d2.color ="White";

        System.out.println(d1.name);
        System.out.println(d2.name);
        System.out.println(d1.noOfLegs);
        System.out.println(d2.noOfLegs);
    }
}
