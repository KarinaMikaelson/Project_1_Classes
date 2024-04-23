package org.example.class23;
/*
Wrong way using the Array size
 */
import java.util.Arrays;

public class E1 {
    public static void main(String[] args) {
        String name = "Maggy";
        String name2 = "Diana";
        String [] names = new String[20];
        names[0] = "Nancy";
        names[1] = "James";
        System.out.println(Arrays.toString(names));
    }
}
