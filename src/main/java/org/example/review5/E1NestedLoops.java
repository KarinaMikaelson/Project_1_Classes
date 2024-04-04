package org.example.review5;

public class E1NestedLoops {
    public static void main(String[] args) {

        for(int i = 0; i < 5; i++){
            for(int j = 0; j <5; j++){
                System.out.println(j);  // Output: 01234 - 5 times
            }
        }
    }
}
