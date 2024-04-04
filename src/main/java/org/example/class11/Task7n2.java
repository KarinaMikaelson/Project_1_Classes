package org.example.class11;
/*
    Create a String that should be combination of letters, numbers and special characters.
    Find out how many Alphabets(abd AZ)
    characters are there in the String.
     */
public class Task7n2 {
    public static void main(String[] args) {
        String str = "xwjdfuALHG84aj192An1";
        System.out.println(str.replaceAll("[^A-Za-z]","").length());
    }
}
