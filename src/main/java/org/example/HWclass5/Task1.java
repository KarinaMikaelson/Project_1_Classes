package org.example.HWclass5;

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        /*
          Prompt the user to enter person heights in inches. Person should be classified as one of the following:
          • short (under 60 inch)
          • medium(between 60 -72 inch)
          • tall (over 72 inch)
        */
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter your height in inches");
        double heightInches=scan.nextDouble();
        if(heightInches<60){
            System.out.println("The person is classified as short.");
        }else if(heightInches >= 60 && heightInches <= 72){
            System.out.println("The person is classified as medium");
        }else{
            System.out.println("The person is classified as tall");
        }
    }
}
