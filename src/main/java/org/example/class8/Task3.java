package org.example.class8;
/*
Create a 2D array(shorter way) in which first array will consist of 4 names and second array will contain grades.
Then your program should print name of the students that has A and B grade
 */
public class Task3 {
    public static void main(String[] args) {

        String[][] matrix = {
                {"James", "Karla", "Andy"},
                {"A", "B", "C"}
        };
        for (int i = 0; i < matrix[0].length; i++) {
            if (matrix[1][i].equals("A") || matrix[1][i].equals("B")) {
                System.out.println(matrix[0][i]);
            }
        }
    }
}

