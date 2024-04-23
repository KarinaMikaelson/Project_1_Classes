package org.example.class23;
/*
How to use LOOPS with ArrayList
"for each loop"
 */
import java.util.ArrayList;
public class E4 {
    public static void main(String[] args) {
        ArrayList<String> names = new ArrayList();
        names.add("James");
        names.add("Bony");
        names.add("Clyde");
        names.add("Shrek");
        for(int i =0; i < names.size(); i++){
            System.out.println(names.get(i));
        }
        System.out.println("*******");
        //Enhanced for loop
        for(String s:names){
            System.out.println(s);
        }
    }
}
