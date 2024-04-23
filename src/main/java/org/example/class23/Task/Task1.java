package org.example.class23.Task;

import java.util.ArrayList;

/*
Create an ArrayList that will store 5 names into it.
• Find out whether the given ArrayList is empty or not?
• Check whether the specific name is present in an ArrayList or not?
• Find the size of your ArrayList and print all values from that
 */
public class Task1 {
    public static void main(String[] args) {
        ArrayList<String> names = new ArrayList();
        names.add("James");
        names.add("Bony");
        names.add("Clyde");
        names.add("Shrek");
        names.add("Fiona");

        System.out.println(names.isEmpty());
        System.out.println(names.contains("Fiona"));
        System.out.println(names.size());
        System.out.println(names);
    }
}
