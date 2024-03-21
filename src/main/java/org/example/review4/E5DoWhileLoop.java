package org.example.review4;

import java.util.Scanner;

public class E5DoWhileLoop {
    public static void main(String[] args) {

        /*
        With scanner - While Loop  will execute code more than one time, that's  why better to use Do While
         */

        Scanner scan = new Scanner(System.in);
        System.out.println("Please Enter the number");
        int number = scan.nextInt();
        while(number<10){   // if the number is < 10, the code will ask the same question until  number>10
            System.out.println("Please Enter the number");
            number = scan.nextInt();
        }
    }
}
