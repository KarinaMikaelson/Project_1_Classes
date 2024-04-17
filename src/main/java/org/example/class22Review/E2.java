package org.example.class22Review;
/*
Count the Number of Words in a String.
Write a function to count the number off words in a given string.
Words are separated by spaces or punctuations.
For example, the input "Hello, world!" should return 2.
 */

public class E2 {
    public static int countWords(String input) {
        if (input == null || input.isEmpty()) {
            return 0; // Return 0 if the input string is null or empty
        }

        // Split the input string by spaces and punctuations
        String[] words = input.split("[\\s\\p{Punct}]+");

        // Return the length of the resulting array, which represents the number of words
        return words.length;
    }

    public static void main(String[] args) {
        String input = "Hello, world!";
        int wordCount = countWords(input);
        System.out.println("Number of words: " + wordCount); // Output: Number of words: 2
    }
}

