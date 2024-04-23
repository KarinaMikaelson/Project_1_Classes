package org.example.class24.Tasks;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

/*
Create a Set of cities in which you want to make sure that insertion order is maintained.
Then remove any city that starts with "A";
 */
public class Task4 {
    public static void main(String[] args) {
        Set<String> cities = new LinkedHashSet<>();
        cities.add("London");
        cities.add("Astana");
        cities.add("Atlanta");
        cities.add("Rio");
        cities.add("Paris");

        // Create another Object
        Set<String> citiesToRemove = new HashSet<>();
        for (String city : cities) {
            if (city.startsWith("A")) {
                citiesToRemove.add(city);
            }
        }
        cities.removeAll(citiesToRemove);

        // Print the remaining cities
        System.out.println("Cities after removing those starting with 'A':");
        for (String city : cities) {
            System.out.println(city);

    }
}
}
