package org.example.class23;
/*
ArrayList - class
1. contains method
2. get method
3. isEmpty method
 */
import java.util.ArrayList;
public class E3 {
    public static void main(String[] args) {
        ArrayList<String> names = new ArrayList();
        names.add("James");
        names.add("Bony");
        names.add("Clyde");
        names.add("Shrek");
        System.out.println(names.contains("John"));
        System.out.println(names.get(0));
        System.out.println(names.isEmpty());
        System.out.println(names.indexOf("Shrek"));
        System.out.println(names.set(0,"Shrek"));
        System.out.println(names);
    }
}
