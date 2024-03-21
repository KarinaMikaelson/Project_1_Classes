package org.example.class8;

public class Task2 {
    public static void main(String[] args) {


        int[][] matrix = {
                {10, 20, 40, 50},
                {22, 40, 90, 65},
                {15, 50, 33, 30}
        };
// Add all of the even numbers from this 2D array and print the sum
        int sum = 0;
        for (int i = 0; i < 3; i++) {     // i<3 - because it's 3 lines
            for (int j = 0; j < 4; j++) {// j<4 - because it's 4 values in each line
                if (matrix[i][j] % 2 == 0) {
                    sum = sum + matrix[i][j];
                }

            }
            System.out.println(sum);
        }
    }
}