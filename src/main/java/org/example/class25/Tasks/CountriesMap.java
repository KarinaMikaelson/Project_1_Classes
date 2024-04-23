package org.example.class25.Tasks;

import java.util.Map;
import java.util.TreeMap;

/*
Create a map of countries(5) with its capital that will store countries in alphabetical order.
Country names will be keys and capitals will be values
• Print all keys and values from a country map using for each loop or
Lambda.
• Print all values from a country map using for each loop or Lambda.
 */
public class CountriesMap {
    public static void main(String[] args) {

        Map<String,String> countryMap = new TreeMap<>();
        countryMap.put("France","Paris");
        countryMap.put("Germany","Berlin");
        countryMap.put("England","London");
        countryMap.put("Irland","Dublin");
        countryMap.put("Belgium","Brusel");
        // for each loop
        for(Map.Entry<String,String> entry:countryMap.entrySet()){
            System.out.println("Country:"+entry.getKey()+" Capital:"+entry.getValue());
        }
        System.out.println("*********************");

        // Print all keys and values using lambda expression
        countryMap.forEach((country, capital) -> System.out.println("Country: " + country + ", Capital: " + capital));

        System.out.println("*********************");

        //Print all values from a country map using for each loop
        for(String capital:countryMap.values()){
            System.out.println(capital);
        }
        System.out.println("*********************");
        // Print all values from a country map using Lambda.
        countryMap.forEach((country, capital)-> System.out.println(capital));
    }
}


