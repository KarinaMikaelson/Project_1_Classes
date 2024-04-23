package org.example.class23;

import java.util.ArrayList;

/*
Explanation of E5 - sizes of each name
 */
public class E6 {
    public static void main(String[] args) {
        ArrayList<String> names = new ArrayList();
        names.add("James");
        names.add("Bony");
        names.add("Clyde");
        names.add("Shrek");

        for(int i = 0; i < names.size(); i++){
            String n = names.get(i);
            System.out.println(n.length());
            // This two exactly same function methods
            System.out.println(names.get(i).length());
        }
    }
}
