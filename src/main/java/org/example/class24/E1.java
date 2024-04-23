package org.example.class24;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class E1 {
    public static void main(String[] args) {
        LinkedList<Integer> numbers = new LinkedList<>();
        numbers.add(10);
        numbers.add(20);
        numbers.add(30);
        numbers.add(40);
        numbers.removeIf(d -> d>30);
        System.out.println(numbers);
    }
}
