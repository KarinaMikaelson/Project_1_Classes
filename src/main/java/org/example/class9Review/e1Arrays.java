package org.example.class9Review;

public class e1Arrays {
    public static void main(String[] args) {

        int [] numbers={10, 25, 45, 66, 85, 100};
        System.out.println(numbers.length);   // to find how many values
        System.out.println(numbers[3]);   // to find the index of 66
        // System.out.println(numbers[-5]);   here we will see an error and the address and link to the error
        for(int i = 0 ; i < numbers.length; i++){   // if i want to print all elements from 2d array
            System.out.println(numbers[i]+" ");
            System.out.println(i+" "+numbers[i]+" "); // if i want to print both - index and values
        } // i - index
    }
}
