package org.example.class23;
/*
ArrayList - class
1. add method
2. remove method
 */
import java.util.ArrayList;

public class E2 {
    public static void main(String[] args) {
        ArrayList<String> names = new ArrayList();
        names.add("James");
        names.add("Bony");
        names.add("Clyde");
        names.add("Shrek");
        System.out.println(names);
        System.out.println(names.size());
        names.remove("James");
        System.out.println(names);
        names.remove(2);
        System.out.println(names);
    }
}
