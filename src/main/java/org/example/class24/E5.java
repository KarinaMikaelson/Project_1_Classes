package org.example.class24;

import java.util.*;

/*
TreeSet - keep elements organised
 */
public class E5 {
    public static void main(String[] args) {
        Set<Integer> numbers = new TreeSet<>();
        numbers.add(50);
        numbers.add(50); //will be ignored
        numbers.add(34);
        numbers.add(10);
        numbers.add(23);
        System.out.println(numbers);
        //If we want to get elements, use enhanced for loop or lambda
        for(Integer i:numbers){
            System.out.println(i);
        }
        System.out.println("*******");

        numbers.forEach(x -> System.out.println(x));
        System.out.println("*******");

        List<Integer> integerList = new ArrayList<>(numbers);  // converting to List
        for(int i = 0; i < integerList.size(); i ++){
            System.out.println(integerList.get(i));
        }
    }
}
