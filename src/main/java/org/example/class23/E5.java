package org.example.class23;
/*
Lambda expression
 */
import java.util.ArrayList;

public class E5 {
    public static void main(String[] args) {
        ArrayList<String> names = new ArrayList();
        names.add("James");
        names.add("Bony");
        names.add("Clyde");
        names.add("Shrek");

        // Lambda expression
        names.forEach(x-> System.out.println(x));
        // x -> - variable
        names.forEach(x -> System.out.println(x.length()));
        // length of each name: 5 4 5 5
        // x var represent each String

    }
}
