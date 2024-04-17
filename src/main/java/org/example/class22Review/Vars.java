package org.example.class22Review;

public class Vars {
    String name; // INSTANCE VAR
    static int populations = 800000;   // STATIC VAR
    Vars(){
        String color = "Green";  // LOCAL VAR
    }
    void print(){  //INSTANCE METHOD , no static keyword
        //System.out.println(color);
        System.out.println(name);
    }
    void print2(){
        System.out.println(name);
    }
    static void printName(){
        //System.out.println(name);    NOT ALLOWED TO USE INSTANCE VAR IN STATIC METHODS
    }
}
