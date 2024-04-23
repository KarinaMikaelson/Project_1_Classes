package org.example.class25;
/*
ArrayList inside ArrayList, and their Objects
 */
import java.util.ArrayList;

public class E6 {
    public static void main(String[] args) {

        ArrayList<ArrayList<String>> list = new ArrayList();
        ArrayList<String> names = new ArrayList<>();
        names.add("Milo");
        names.add("Loki");

        ArrayList<String> names2 = new ArrayList<>();
        names2.add("Spooky");
        names2.add("Mishka");
        list.add(names);
        list.add(names2);
        System.out.println(list);
    }
}
