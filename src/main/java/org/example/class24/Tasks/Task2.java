package org.example.class24.Tasks;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

/*
How can you remove all duplicates from
ArrayList?
 */
public class Task2 {
    public static void main(String[] args) {
        List<String> aList=new ArrayList<>();
        aList.add("John");
        aList.add("Jane");
        aList.add("James");
        aList.add("Jasmine");
        aList.add("Jane");
        aList.add("James");

        aList.forEach(x-> System.out.println(x));
        System.out.println("**********");

        Set<String> aListSet = new TreeSet<>(aList);
        aListSet.forEach(x -> System.out.println(x));

    }
}
