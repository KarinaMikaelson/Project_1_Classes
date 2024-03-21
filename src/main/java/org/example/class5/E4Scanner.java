package org.example.class5;

import java.util.Scanner;

public class E4Scanner {
    public static void main(String[] args) {

        Scanner scan=new Scanner(System.in);
        System.out.println("Please enter the gender m/f");
        char gender=scan.next().charAt(0);
        // That is how to pick first letter for char
        System.out.println(gender);
    }
}
