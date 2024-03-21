package org.example.HWclass5;

import java.util.Scanner;

public class Task52 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter your birth Month");
        String month = scan.nextLine();
        switch (month) {
            case ("March"):
            case ("April"):
            case ("May"):
                System.out.println("You were born is season Spring");
                break;
            case ("June"):
            case ("July"):
            case ("August"):
                System.out.println("You were born is season Summer");
                break;
            case ("september"):
            case ("october"):
            case ("november"):
                System. out.println("You were born is season Autumn");
                break;
            case ("december"):
            case ("january"):
            case ("february"):
                System.out.println("You were born is season Winter");
                break;
        }
    }
}
