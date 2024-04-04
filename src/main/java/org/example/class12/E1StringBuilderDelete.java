package org.example.class12;

public class E1StringBuilderDelete {
    /*
    deleteCharAt(index) - to delete specific character
    delete(index from, index to) - deletes a range of characters.
     */
    public static void main(String[] args) {

        StringBuilder str = new StringBuilder("Sunday7343Monday");
        str.deleteCharAt(6);
        str.delete(2,10);
        System.out.println(str);
    }
}
