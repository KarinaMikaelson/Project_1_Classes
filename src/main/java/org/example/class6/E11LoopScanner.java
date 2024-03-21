package org.example.class6;

import java.util.Scanner;

public class E11LoopScanner {
    public static void main(String[] args) {

        Scanner scan=new Scanner(System.in);
        System.out.println("Please Enter the starting point of the loop");
        int start=scan.nextInt();
        System.out.println("Please Enter the stopping point of the loop");
        int end=scan.nextInt();
        System.out.println("Please Enter the step size");
        int step=scan.nextInt();
        //Step size - how many numbers will be skipped each time

        while (start<=end){
            System.out.print(start+" ");
            start=start+step;
        }
    }
}
