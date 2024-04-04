package org.example.class11;

public class E14String {
    public static void main(String[] args) {
        // To split the string by sentences

        String str = "Mat you still have time to run away. Listen to me only.";
        String [] sentences = str.split("[.]");
        System.out.println(sentences.length);
        System.out.println(sentences[1].trim()); // use trim method to remove spaces
    }
}
