package org.example.class17;

public class AnimalTester {
    public static void main(String[] args) {
        Cat c = new Cat();
        c.name = "Lulu";
        c.color = "Black";
        c.age = 1;
        c.speak();
        c.sleep();
        c.printInfo();

        Dog d = new Dog();
        d.name = "Balto";
        d.color = "White";
        d.age = 3;
        d.bark();
        d.sleep();
        d.printInfo();
    }
}
