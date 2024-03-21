package org.example.class5;

import java.util.Scanner;

public class E5Scanner {
    public static void main(String[] args) {

        Scanner scan=new Scanner(System.in);
        System.out.println("Please Enter your age");
        int age=scan.nextInt();
        System.out.println("Please Enter your Full Name");
        scan.nextLine();
        //Extra call to nextLine to clear buffer memory
        String fullName=scan.nextLine();
        System.out.println("Your name is "+fullName+" you are "+age+" years old");

    }
}
