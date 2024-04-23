package org.example.class24;
/*
LinkedList way more faster than ArrayList
 */
import java.util.ArrayList;
import java.util.LinkedList;

public class E3 {
    public static void main(String[] args) {
        System.out.println(System.currentTimeMillis());
        // will store this time in var
        long startTime = System.currentTimeMillis();
        LinkedList<String> names = new LinkedList<>();
        for(int i = 0; i < 100000; i++){
            names.add(0,"Nikola");
        }
        long endTime = System.currentTimeMillis();
        System.out.println(endTime - startTime);
    }
}
