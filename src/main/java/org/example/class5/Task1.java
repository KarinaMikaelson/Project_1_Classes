package org.example.class5;

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {

        Scanner scan=new Scanner(System.in);
        System.out.println("What is the amount of loan needed?");
        double number=scan.nextDouble();
        if(number<=200000){
            System.out.println("You are eligible for the loan");
        }else{
            System.out.println("You are not eligible");
        }
    }
}
