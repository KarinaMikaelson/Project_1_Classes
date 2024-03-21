package org.example.class4;

import java.util.Scanner;

public class E6Scanner {
    public static void main(String[] args) {
        //New Scanner(System.in) creating the object
        Scanner scan= new Scanner(System.in);
        System.out.println("Please enter your age");
        int age=scan.nextInt();
        System.out.println("You are "+age+" years old");
        //Enter age in the output and press ENTER
    }
}
