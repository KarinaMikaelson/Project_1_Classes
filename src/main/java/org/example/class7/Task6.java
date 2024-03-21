package org.example.class7;
/*
Create an array on integers and calculate the sum of all elements in an array
 */
public class Task6 {
    public static void main(String[] args) {
        // Create an array of integers
        int [] numbers={9,2,3,7,5};
        // Initialize a variable to store the sum
        int sum=0; //always store the first value
        // Iterate through the array and calculate the sum
        for (int num : numbers) {
            sum += num; //or sum=sum+num;
            // num: is always automatic loop
        }
        // Output the sum
        System.out.println(sum);


    }
}
