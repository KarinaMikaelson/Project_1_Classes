package org.example.class5;

import java.util.Scanner;

public class Task5 {
    public static void main(String[] args) {

        Scanner scan=new Scanner(System.in);
        System.out.println("Enter the number of years worked:");
        int yearsWorked = scan.nextInt();
        System.out.println("Enter the annual salary:");
        double annualSalary = scan.nextDouble();

        double bonus = 0;

        if (yearsWorked >= 5) {
            if (annualSalary > 50000) {
                bonus = 5000;
            } else {
                bonus = 3000;
            }
            System.out.println("Congratulations! You are eligible for a bonus of $" + bonus);
        } else {
            System.out.println("Sorry, you are not eligible for a bonus.");
        }

        scan.close();
        //Read about scan.close();
    }
}

