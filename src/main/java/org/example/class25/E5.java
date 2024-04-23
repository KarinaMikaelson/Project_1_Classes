package org.example.class25;
/*
entrySet method - where key/value pairs stored
 */
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class E5 {
    public static void main(String[] args) {
        TreeMap<Integer, String> students = new TreeMap<>();
        students.put(1,"Nicola");
        students.put(6,"Will");
        students.put(4,"Tosten");
        students.put(2,"Ali");
        students.put(3,"Karina");
        System.out.println(students);
        //students.entrySet();
        Set<Map.Entry<Integer,String>> entrySet = students.entrySet();
        System.out.println(entrySet);
    }
}
