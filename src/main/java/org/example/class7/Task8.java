package org.example.class7;
/*
Create an array to store char values and then print those in reverse order
 */
public class Task8 {
    public static void main(String[] args) {

        char[] charArray = {'a', 'b', 'c', 'd', 'e'};
        for (int i = charArray.length - 1; i >= 0; i--) {
            System.out.print(charArray[i] + " ");
            // charArray.length - It called generic code - automatically updates data
        }
    }
}
