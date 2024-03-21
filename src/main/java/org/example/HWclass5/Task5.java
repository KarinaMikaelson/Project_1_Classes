package org.example.HWclass5;

import java.util.Scanner;

public class Task5 {
    public static void main(String[] args) {

        Scanner scan=new Scanner(System.in);
        System.out.println("Enter your birth month");
        //Read more about switch and all possible conditions
        // Read about Methods
        String birthMonth = scan.nextLine().toLowerCase();
        scan.close();

        String season = getSeason(birthMonth);
        if (!season.equals("Invalid month")) {
            System.out.println("You were born in season "+season);
        } else {
            System.out.println("Invalid input");
        }
    }

    public static String getSeason(String month) {
        return switch (month) {
            case "march", "april", "may" -> "Spring";
            case "june", "july", "august" -> "Summer";
            case "september", "october", "november" -> "Autumn";
            case "december", "january", "february" -> "Winter";
            default -> "Invalid month";
        };
    }
}
