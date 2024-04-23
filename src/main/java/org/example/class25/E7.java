package org.example.class25;

import java.util.ArrayList;

public class E7 {
    public static void main(String[] args) {
        ArrayList<ArrayList<String >> syntaxStudents = new ArrayList<>();
        ArrayList<String> female = new ArrayList<>();
        female.add("Nicole");
        female.add("Diana");
        female.add("Olga");
        female.add("Karina");

        ArrayList<String> male = new ArrayList<>();
        male.add("Matt");
        male.add("Josh");
        male.add("Ali");

        syntaxStudents.add(female);
        syntaxStudents.add(male);
        System.out.println(syntaxStudents);

    }
}
