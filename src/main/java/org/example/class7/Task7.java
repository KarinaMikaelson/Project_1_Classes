package org.example.class7;
/*
From an array of integer elements find the largest number.
 */
public class Task7 {
    public static void main(String[] args) {

        // Create an array of integers
        int [] numbers={5,10,15,20,25};
        // Initialize a variable to store the largest number
        int largestNum = numbers[0];  // Assume the first element is the largest

        // Repeat through the array to find the largest number
        for (int i = 1; i < numbers.length; i++) {
            if (numbers[i] > largestNum) {
                largestNum = numbers[i];
            }
        }
        System.out.println(largestNum);


    }
}
