package org.example.class25;

import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class E9 {
    public static void main(String[] args) {

        Map<Integer,String> students = new TreeMap<>();
        students.put(1,"Nicola");
        students.put(6,"Will");
        students.put(7,"Ali");
        students.put(3,"Nicola");
        students.put(2,"Nicola");
        System.out.println(students);
        Set<Map.Entry<Integer,String>> entrySet = students.entrySet();
        //ArrayList<Map.Entry<Integer,String>> entrySet = new ArrayList
        entrySet.removeIf(x->x.getKey()>3 && x.getValue().contains("l"));
        // if repeated times > 3 , and contains "l"
        System.out.println(students);
    }
}
