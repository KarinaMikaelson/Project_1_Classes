package org.example.class11;

public class E13String {
    public static void main(String[] args) {
        //split method
        // to split string by words and store them, i need to use array
        String str = "Matt you still have time to run away";
        String [] words = str.split(" ");
        System.out.println(words.length);
        System.out.println(words[0]);

        for(int i = 0; i < words.length; i++){
            System.out.print(words[i]);
            System.out.print(" ");
        }

    }
}
