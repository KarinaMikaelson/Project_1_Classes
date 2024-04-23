package org.example.class23.Task;

import java.util.ArrayList;

/*
Create an arrayList of even numbers from 1 to 500 using a loop.
Then write another loop to Remove any number that is divisible by 5 from that arrayList.
 */
public class Task5 {
    public static void main(String[] args) {
        ArrayList<Integer> evenNumbers = new ArrayList<>();
        for(int i = 0; i <= 500; i = i+2){
            evenNumbers.add(i);
        }
        evenNumbers.removeIf(c ->c%5==0);
        System.out.println(evenNumbers);
    }
}


