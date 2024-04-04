package org.example.class11;

import java.util.Scanner;

public class Task5Substring {
    /*
    Write a program that reads two people's first names and if they expecting boy or girl?
    Based on the input suggests a name for a baby:
    Example Output:
    Mom's first name? Mary Dad's first name? Daniel Boy or Girl? boy
    Suggested baby name: DANRY
    Example Output:
    Mom's first name? Mary Dad's first name? Daniel Boy or Girl? girl
    Suggested baby name: MAIEL
     */
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Mom's first name?:");
        String momName = scan.nextLine();
        System.out.println("Dad's first name?:");
        String dadName = scan.nextLine();
        System.out.println("Boy or Girl?");
        String gender = scan.nextLine().toLowerCase();

        String suggestedName = "";
        if(gender.equals("boy")){
            suggestedName = dadName.substring(0,dadName.length()/2) + momName.substring(momName.length()/2);
        }else if(gender.equals("girl")){
            suggestedName = momName.substring(0,momName.length()/2) + dadName.substring(dadName.length()/2);
        }else{
            System.out.println("Invalid gender");
        }
        System.out.println("Suggested name for baby: "+suggestedName);
    }
}
