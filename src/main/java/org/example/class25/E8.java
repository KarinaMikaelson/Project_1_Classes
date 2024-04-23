package org.example.class25;

import java.util.ArrayList;
import java.util.LinkedHashMap;

public class E8 {
    public static void main(String[] args) {
        //Create an ArrayList of Maps

        ArrayList<LinkedHashMap<String, Integer>> listMap = new ArrayList<>();
        LinkedHashMap<String,Integer> fruit = new LinkedHashMap<>();
        fruit.put("Kiwi",10);
        fruit.put("Apple",15);
        fruit.put("Banana",32);

        LinkedHashMap<String,Integer> makeUp = new LinkedHashMap<>();
        makeUp.put("Lipstick",3);
        makeUp.put("EyeLiner",5);
        makeUp.put("Foundation",15);

        listMap.add(fruit);
        listMap.add(makeUp);
        System.out.println(listMap);

        System.out.println(listMap.get(0).get("Banana"));  // 0 is index for the first map in the list
        //To get an element get(0) to get the map from the list, get(element) to get element
    }
}
