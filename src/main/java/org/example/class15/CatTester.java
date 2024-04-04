package org.example.class15;

public class CatTester {
    public static void main(String[] args) {
        Cat c1 = new Cat();
        c1.name = "Milo";
        c1.color = "Black";
        c1.age = 4;
        c1.printInfo();

        Cat c2 = new Cat();
        c2.name = "Loki";
        c2.color = "White";
        c2.age = 5;
        c2.printInfo();

        Cat c3 = new Cat();
        c3.name = "Amy";
        c3.color = "Brown";
        c3.age = 9;
        c3.printInfo();
    }
}