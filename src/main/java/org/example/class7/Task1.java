package org.example.class7;

import java.util.Arrays;

public class Task1 {
    public static void main(String[] args) {

        char [] grades=new char[4];
        grades[0]='A';
        // Storing the letter A inside the box 0
        grades[1]='B';
        grades[2]='C';
        grades[3]='D';
        //grades[4]='E';
        //If i put 4 boxes, it will only allow 0,1,2,3
        System.out.println(Arrays.toString(grades));
    }
}
