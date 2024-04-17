package org.example.class19;

public class e2 {
    public static void main(String[] args) {
       Animal a = new Cat();
       // Dog d = (Dog)a;
        Cat c = (Cat)a;
        c.eat();
        int f = 10;
        byte g = (byte)f;
        System.out.println(g);
    }
}
