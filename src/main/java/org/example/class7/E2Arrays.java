package org.example.class7;

import java.util.Arrays;

public class E2Arrays {
    public static void main(String[] args) {

        String [] studentsNames=new String [50];
        // First way to create Arrays - create empty boxes first and then put the values
        // computer create 50 boxes(values) for ARRAY
        // Combine with loop to shorten the code
        studentsNames[4]="Lora";
        studentsNames[10]="James";
        System.out.println(Arrays.toString(studentsNames));
    }
}
