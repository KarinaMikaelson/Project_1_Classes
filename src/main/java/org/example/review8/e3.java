package org.example.review8;
/*
Overloading
1. return type of methods does not play any role
 */
public class e3 {
    void print(String word){
        System.out.println(word);
    }
}
class E4 extends e3{
    @Override
    void print(String word){
        super.print(word);
    }
}
