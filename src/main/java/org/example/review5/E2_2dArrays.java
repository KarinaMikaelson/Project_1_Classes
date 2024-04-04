package org.example.review5;

public class E2_2dArrays {
    public static void main(String[] args) {

        String[][] names = {
                {"James", "Karina", "Loki"},
                {"Milo", "Teona", "Manu"},
                {"Will", "Barkat", "Olga"}

        };
        for( int row = 0; row < 3; row++){
            for(int column = 0; column < 3; column++){
                System.out.print(names[row][column]+" ");
            }
            System.out.println();
        }
    }
}


