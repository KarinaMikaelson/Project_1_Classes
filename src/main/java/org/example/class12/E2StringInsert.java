package org.example.class12;

public class E2StringInsert {
    /*
    insert(index, character) - we replace a character to another place
     */
    public static void main(String[] args) {
        StringBuilder str = new StringBuilder("Sunday2374Monday");
        str.insert(0,"o");
        System.out.println(str);
    }
}
