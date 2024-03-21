package org.example.class5;

import java.util.Scanner;

public class HomeTask2 {
    public static void main(String[] args) {
        /*
        Write a program that will prompt the user for Day number and print whether it is a weekend or weekday
        If any day from 1-5 → output “It is a weekday”
        Any day from 6-7 → output “It is a weekend”
        Any other day → output “Invalid day”
        Test your task for -1 3 6 and 8
         */
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter the the number of the Day");
        int day=scan.nextInt();
        if(day>=1 && day<=5){
            System.out.println("It is a weekday");
        }else if(day>=6 && day<=7){
            System.out.println("It is a weekend");
        }else{
            System.out.println("Invalid day");
        }
    }
}
