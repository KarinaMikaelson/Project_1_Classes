package org.example.review8;
/*
Overloading
1. can not change Access Modifier
2. No changing return types
3. Npo changing names of the parameters
 */

public class E1 {
    void add(int a, int b){
        System.out.println(a+b);
    }
    void add(double a, double b, double c){
        System.out.println(a+b);
    }
    void add(double a , int b){
        System.out.println(a+b);
    }
    void add(int a, double b){
        System.out.println(a+b);
    }

    public static void main(String[] args) {
        System.out.println(15);
        System.out.println(15.5);
        System.out.println('c');

    }
}
