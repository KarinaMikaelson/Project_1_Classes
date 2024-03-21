package org.example.HWclass5;

import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) {
        /*
        Write a program that will ask user to input the current time (use 24 hour format).
        Based on the given time define:
        if hour is between 1-11 --> Morning
        if hour between 12-15 --> Afternoon
        if hour between 16-20 --> Evening
        if hour between 21-24 --> Night
        If anything else print invalid
         */

        Scanner scan=new Scanner(System.in);
        System.out.println("Enter the current time");
        double time=scan.nextDouble();
        if(time>=1 && time<=24){
            if(time>=1 && time<=11){
                System.out.println("It's morning");
            }else if(time>=12 && time<=15){
                System.out.println("It's afternoon");
            }else if(time>=16 && time<=20){
                System.out.println("It's evening");
            }else if(time>=21 && time<=24){
                System.out.println("It's night");
            }
        }else{
            System.out.println("Invalid");
        }
    }
}
