package org.example.class11;

public class Task8n2 {
    /*
    You have a String a="Is it saturday? Is it raining? Do we have a Java Class today?"
    How would you find out how many sentences are in that String?
     */
    public static void main(String[] args) {

        String a = "Is it saturday? Is it raining? Do we have a Java Class today?";
        System.out.println(a.split("[?]").length);
    }
}
