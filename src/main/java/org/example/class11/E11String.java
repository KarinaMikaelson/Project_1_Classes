package org.example.class11;

public class E11String {
    public static void main(String[] args) {
        //replaceAll method

        String str = "sdjfh735567sdf3ds9";
        //replace all numbers from 0-9 in the string to "*"
        System.out.println(str.replaceAll("[0-9]","*"));
        System.out.println(str.replaceAll("[a-z]", "")); // all letters will be removed
        System.out.println(str.replaceAll("[A-Z]","")); // uppercase only
        System.out.println(str.replaceAll("[A-Z0-9]",""));
        System.out.println(str.replaceAll("[A-Za-z0-9]","")); // everything will be removed
        System.out.println(str.replaceAll("[^A-Za-z0-9]","")); // ^ do not replace
    }
}
