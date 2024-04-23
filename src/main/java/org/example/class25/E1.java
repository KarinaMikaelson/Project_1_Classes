package org.example.class25;

import java.util.HashMap;

/*
Maps (Not part of the Collection Framework)
 */
public class E1 {
    public static void main(String[] args) {
        HashMap<String, Integer> groceryMap = new HashMap<>();
        groceryMap.put("BlushOn",20);
        groceryMap.put("Lipstick",50);
        groceryMap.put("EyeLiner", 45);
        groceryMap.put("Foundation",200);

        groceryMap.remove("Lipstick");
        System.out.println(groceryMap);

        groceryMap.replace("EyeLiner",67);

        System.out.println(groceryMap);

        System.out.println(groceryMap.get("Lipstick"));
        System.out.println(groceryMap.size());
        System.out.println(groceryMap.containsKey("EyeLiner"));
        System.out.println(groceryMap.containsValue(45));
        System.out.println(groceryMap.isEmpty());
    }
}
