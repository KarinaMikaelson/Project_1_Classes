package org.example.class12;

public class E3Append {
    /*
   append.("") - to add something to the string
     */
    public static void main(String[] args) {
        StringBuilder stringBuilder = new StringBuilder("Hello");
        stringBuilder.append(", World"); // Modifies the StringBuilder in place
        String result = stringBuilder.toString(); // Converts to String
        System.out.println(result); // Output: Hello, World

    }
}
