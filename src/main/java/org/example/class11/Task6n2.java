package org.example.class11;

public class Task6n2 {
    /*
    Create a String that will hold a sentence.
    Write a program to get a new String without any spaces.
     */
    public static void main(String[] args) {

        String str = "The boat was like a pea floating in a great bowl of blue soup.";
        String newString = str.replaceAll(" ","");
        System.out.println (newString);
        System.out.println(str. replaceAll (" ",""));
        }
    }
