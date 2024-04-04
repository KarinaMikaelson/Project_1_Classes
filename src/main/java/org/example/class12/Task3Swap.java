package org.example.class12;
/*
 How would you swap 2 strings without a temporary variable?
 */
public class Task3Swap {
    public static void main(String[] args) {

        String a = "Hello";
        String b = "World";
        System.out.println("Strings before swap: a = " + a + " and b = "+b);
        // append(+) 2nd string to 1st
        a = a + b;
        // store initial string a in string b , from 0 index to length
        b = a.substring(0,a.length()-b.length());
        // store initial string b in string a
        a = a.substring(b.length());
        System.out.println("Strings after swap: a = " + a + " and b = " + b);

    }
}
