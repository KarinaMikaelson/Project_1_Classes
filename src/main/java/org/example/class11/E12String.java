package org.example.class11;

public class E12String {
    public static void main(String[] args) {

        String str = "dwgDKdk4d8309gjdlruvnSD";
        System.out.println(str.replaceAll("[^a-z]", ""));
        System.out.println(str.replaceAll("[^a-z0-9]", ""));
    }
}
