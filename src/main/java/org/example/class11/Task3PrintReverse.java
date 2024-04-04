package org.example.class11;

public class Task3PrintReverse {
    /*
     Create a String and print it in reverse order (Sunday - yadnuS).
     */
    public static void main(String[] args) {

        String str = "My name is Karina";
        // Convert the string to a character array
        char[] charArray = str.toCharArray();
        // Iterate over the character array in reverse order and print each character
        System.out.print("Reversed string: ");
        for (int i = charArray.length - 1; i >= 0; i--) {
            System.out.print(charArray[i]);
        }
    }
}
