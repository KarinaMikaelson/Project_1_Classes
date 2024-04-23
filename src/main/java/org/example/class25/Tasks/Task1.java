package org.example.class25.Tasks;

import java.util.TreeMap;

/*
Create a map of a building. Store floor number and its associated company name. (Example: 1= Google, 2=Syntax etc.).
Insert 7 entries with duplicate keys and values.
• Check how many entries you have?
Update company on a 4th floor
• Remove company on the 7th floor
• Print your map
 */
public class Task1 {
    public static void main(String[] args) {
        TreeMap<Integer, String> floorsMap = new TreeMap<>();
        floorsMap.put(5,"Apple");
        floorsMap.put(3,"Google");
        floorsMap.put(1,"Uber");
        floorsMap.put(2,"Yandex");
        floorsMap.put(5,"Apple");
        floorsMap.put(4,"Lyft");
        floorsMap.put(6,"Meta");
        floorsMap.put(7,"Samsung");
        floorsMap.replace(7,"Apple");
        System.out.println(floorsMap);
        //floorsMap.remove(7);

        System.out.println(floorsMap.size());

    }
}
