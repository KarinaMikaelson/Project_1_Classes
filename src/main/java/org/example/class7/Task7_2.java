package org.example.class7;
/*
From an array of integer elements find the largest number.
 */
public class Task7_2 {
    public static void main(String[] args) {

        // Second (easy) way
        int [] numbers={5,10,15,20,25};
        int max = numbers[0]; // Assume the first value is largest

        //Loop checks if the assumption is right
        //It picks each value one by one to compare if max(first value)is < n (one by one values)
        for (int n:numbers){
            if(max<n){
                //It picks each value one by one to compare if max(first value)is < n (one by one values)
                max=n;
            }
        }System.out.println(max);
    }
}
