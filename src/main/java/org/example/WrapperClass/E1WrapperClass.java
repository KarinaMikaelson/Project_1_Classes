package org.example.WrapperClass;
/*
Wrapper Class example
 */
public class E1WrapperClass {
    public static void main(String[] args) {
        //int data = 20;
        //Converting primitive into object
        //Integer i = new Integer(data);
        // Now i is 20
        // This way of converting primitive into objects called Autoboxing
        //Integer j = new Integer(50);
        // How to take value from Integer Object
        // datatypeValue()  - method
        //Integer i = new Integer(10);
        //int j = i.intValue(); // Now j = 10;
        int i = 10;
        Integer data = new Integer(i); //Autoboxing
        int j; // created var j

        j = data.intValue(); //Unboxing
        System.out.println(j);
    }

}
