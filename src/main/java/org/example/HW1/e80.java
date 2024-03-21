package org.example.HW1;
/*
Write a program that sums all numbers that are on even index and on even row.
for example -3 is both negative and odd
-4
 */
public class e80 {
    public static void main(String[] args) {
        int [][] array2D = {
                {-1, 2, -3},
                {4, -5, 6},
                {-7, 8, -9}
        };
        int sum = 0;
        for(int i = 0; i < array2D.length; i++){
            if(i % 2 == 0){
                for(int j = 0; j < array2D[i].length; j++){
                    if(j % 2 == 0){
                        sum = sum + array2D[i][j];
                    }
                }
            }
        }
        System.out.print(sum);

    }
}
