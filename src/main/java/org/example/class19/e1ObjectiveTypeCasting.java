package org.example.class19;
/*
Objective Type Casting
 */
public class e1ObjectiveTypeCasting {
    public static void main(String[] args) {
        double a = 10;
        int b = (int)a;

        Animal animal = new Dog();
        Dog d = (Dog)new Animal();
        // We can store child inside parent, but not opposite
        Animal d2 = new Dog();
        Dog d3 = (Dog)d2;   // we can convert parent object to Child object this way


    }
}
