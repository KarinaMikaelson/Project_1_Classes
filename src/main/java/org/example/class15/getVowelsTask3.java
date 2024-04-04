package org.example.class15;
/*
Create a method that will accept a String as a parameter and return a new String that consist only of vowels.
Method should be available inside the class only where it was declared and executed by calling it is name.
Private Access Modifier, static - to call by name, without creating the object
 */
public class getVowelsTask3 {
    private static String getVowels(String str) {
        return str.replaceAll("[^aeiouAEIOU]","");
    }

    public static void main(String[] args) {
        System.out.println(getVowels("Hello"));
    }
}
