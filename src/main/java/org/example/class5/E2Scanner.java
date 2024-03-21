package org.example.class5;

import java.util.Scanner;

public class E2Scanner {
    public static void main(String[] args) {

        Scanner scan=new Scanner(System.in);
        System.out.println("Please enter a byte number");
        byte smallBox=scan.nextByte();
        System.out.println("Please Enter a double number");
        double bigBox=scan.nextDouble();
        System.out.println("Please Enter a boolean value");
        boolean logicalBox=scan.nextBoolean();

        System.out.println(smallBox);
        System.out.println(bigBox);
        System.out.println(logicalBox);
    }
}
