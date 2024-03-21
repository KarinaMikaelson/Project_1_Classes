package org.example.class7;

import java.util.Arrays;

/*
Create an array of words: Java, Saturday, day, coding, is.
Print the following sentence using elements of array: "Saturday is Java coding day".
 */
public class Task3 {
    public static void main(String[] args) {

        String [] words=new String[5];
        words[2]="Java";
        words[0]="Saturday";
        words[4]="day";
        words[3]="coding";
        words[1]="is";
        System.out.println(Arrays.toString(words));
        //One way
    }
}
