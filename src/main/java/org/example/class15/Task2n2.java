package org.example.class15;
/*
Another way - using loop
Create a method that will take a String as a parameter and returns reversed String.
Method should be available to all classes within your project and accessible by class name.
 */
public class Task2n2 {
    public static String reversedString(String str){
        String reversedStr = "";
        for(int i = str.length()-1; i >=0; i--){
            reversedStr = reversedStr +str.charAt(i);
        }
        return reversedStr; // object
    }

    public static void main(String[] args) {
        System.out.println(Task2n2.reversedString("Sunday"));
    }

}

