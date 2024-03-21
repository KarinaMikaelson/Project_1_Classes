package org.example.class5;

import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) {

        Scanner scan=new Scanner(System.in);
        System.out.println("Do you have a credit card?");
        String stringValue=scan.nextLine();

        if(stringValue.equalsIgnoreCase("yes")){
            System.out.println("What is the balance on your credit card?");
            double balance=scan.nextDouble();
            if(balance>1000){
                System.out.println("You need to pay off your card immediately");
            }else{
                System.out.println("You can spend more");
            }
        }else{
            System.out.println("Do you want to open one?");
        }

    }
}
