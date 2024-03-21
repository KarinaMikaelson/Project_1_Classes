package org.example.review4;

import java.util.Scanner;

public class e6DoWhileLoop {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int number = 0;
        do{
            System.out.println("Please Enter the number");
            number = scan.nextInt();
        }while(number<10);
        // Do While Loop is the best to use with Scanner, so the code will only be executed once
    }
}
