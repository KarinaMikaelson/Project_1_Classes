package org.example.class8;

public class E3_2dArray {
    public static void main(String[] args) {

        /*
        10 20 40 50
        22 40 90 65
        15 50 33 30
        {} for each line
         */
        int [] [] matrix={
                {10, 20, 40, 50},  // 0
                {22, 40, 90, 65},  // 1
                {15, 50, 33, 30}   // 2
              // 0   1    2    3
                // If we put matrix[1][2] - it will give us first line and second column
        };
        System.out.println(matrix [1][2]);
        System.out.println(matrix [0][3]);
        System.out.println(matrix [2][2]);
    }
}
