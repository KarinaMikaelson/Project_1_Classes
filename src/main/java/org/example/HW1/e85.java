package org.example.HW1;

public class e85 {
        public static void main(String[] args) {
            int rows = 7;
            int[][] pattern = new int[rows][];

            // Fill the pattern array
            for (int i = 0; i < rows; i++) {
                pattern[i] = new int[rows - i];
                for (int j = 0; j < rows - i; j++) {
                    pattern[i][j] = j + 1;
                }
            }

            // Print the pattern
            for (int i = 0; i < rows; i++) {
                for (int j = 0; j < pattern[i].length; j++) {
                    System.out.print(pattern[i][j] + " ");
                }
                System.out.println();
            }
        }
    }

