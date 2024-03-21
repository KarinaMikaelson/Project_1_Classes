package org.example.class6;

import java.util.Scanner;

/*
Ask user to enter their country and capture it.
Once value are captured print which language user speak
Do this to any 5 countries
 */
public class Task1 {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Please Enter your country name");
        String country=scan.nextLine();

        switch(country){
            case "USA":
                System.out.println("We speak english");
                break;
            case "Spain":
                System.out.println("We speak spanish");
                break;
            case "China":
                System.out.println("We speak chinese");
                break;
            default:
                System.out.println("invalid input");
        }
    }
}
