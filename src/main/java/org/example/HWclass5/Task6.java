package org.example.HWclass5;

import java.util.Scanner;

public class Task6 {
    public static void main(String[] args) {
        /*
        Write a program that will read three inputs of scores (quiz, mid term, and final scores)
        and determine the grade based on the following rules:
        if the average score >=90 → grade=A
        if the average score >= 70 and <90 → grade=B
        if the average score>=50 and <70 → grade=C
        if the average score<50 → grade=F
        */

        Scanner scan=new Scanner(System.in);

        System.out.println("Enter your quiz score");
        int quizScore= scan.nextInt();
        System.out.println("Enter your mid term score");
        int midTermScore= scan.nextInt();
        System.out.println("Enter your final score");
        int finalScore= scan.nextInt();
        scan.close();

        double averageScore = (quizScore+midTermScore+finalScore)%3;
        String grade;
        if(averageScore >= 90){
            grade = "A";
        }else if(averageScore>=70 && averageScore<90){
            grade = "B";
        }else if(averageScore>=50 && averageScore<70){
            grade = "C";
        }else{
            grade = "F";
        }
        System.out.print("Your grade is "+grade);

    }
}
