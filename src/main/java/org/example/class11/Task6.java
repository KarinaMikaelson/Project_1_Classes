package org.example.class11;

public class Task6 {
    /*
    Create a String that will hold a sentence.
    Write a program to get a new String without any spaces.
     */
    public static void main(String[] args) {

        String sentence = "The boat was like a pea floating in a great bowl of blue soup.";
        String [] words = sentence.split(" ");
        for(int i = 0; i < words.length; i++){
            System.out.print(words[i]);
        }
    }
}
