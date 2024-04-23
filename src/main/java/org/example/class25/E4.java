package org.example.class25;

import java.util.TreeMap;

public class E4 {
    public static void main(String[] args) {
        TreeMap<String, Double> fruit = new TreeMap<>();
        fruit.put("Kiwi",25.5);
        fruit.put("Apple",5.5);
        fruit.put("Orange",5.5);
        fruit.put("Banana",30.5);

        System.out.println(fruit.values());
        //Collection<Double> values = fruit.values();
        var values = fruit.values();
        values.removeIf(x->x>10);
        System.out.println(fruit);
        // Methods from Set are not available in Maps. We need to convert it first
    }
}
