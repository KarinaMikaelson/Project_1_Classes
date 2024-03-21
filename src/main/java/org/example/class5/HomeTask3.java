package org.example.class5;

import java.util.Scanner;

public class HomeTask3 {
    public static void main(String[] args) {
        /*
          Ask user to enter a number and then categorize if number is small, medium or large
          Small number is value between 1 and 10
          Medium number is value between 11 and 100
          Large number is value between 101 and 1000
         */
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter a number");
        int number=scan.nextInt();
        if(number>=1 && number<=10){
            System.out.println("The number is small");
        }else if(number>=11 && number<=100){
            System.out.println("The number is medium");
        }else if(number>=101 && number<=1000){
            System.out.println("The number is large");
        }else{
            System.out.println("Invalid number");
        }
    }
}
