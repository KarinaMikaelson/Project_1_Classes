package org.example.class8;
/*
Loop wth 2dArrays
 */
public class E5_2dArrays {
    public static void main(String[] args) {

        //The outer loop repeats inner loop j times
        // Variables: i,j should be different
        // Inner Loop - controls inner box
        // Outer Loop - controls outer box
        for(int j = 0; j < 7; j++){
            for(int i = 0; i < 5; i ++){
                System.out.print("Java is fun");
            }
            System.out.println();
        }
    }
}
