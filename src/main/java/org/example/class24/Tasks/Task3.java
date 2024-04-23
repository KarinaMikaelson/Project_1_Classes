package org.example.class24.Tasks;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

/*
Create a Set in which you need to add names of the countries(5).
In this set we want all objects to be sorted in alphabetical order. retrieve all elements from set.
 */
public class Task3 {
    public static void main(String[] args) {
        Set<String> countries = new LinkedHashSet<>();
        countries.add("Canada");
        countries.add("France");
        countries.add("Japan");
        countries.add("Australia");
        countries.add("Germany");
        Set<String> sortedCountries = new TreeSet<>(countries);
        for (String country : sortedCountries) {
            System.out.println(country);
        }
    }
}
