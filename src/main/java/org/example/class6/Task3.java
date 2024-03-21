package org.example.class6;

import java.util.Scanner;

/*
Using scanner class create calculator. Allow user to enter 2 numbers and operator(+,,*,/).
Based on operator provide the result to user.
Please complete this assignment in 2 ways: using if statement and switch case.
 */
public class Task3 {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Please Enter two numbers and the operator +-*/");

        double num1= scan.nextDouble();
        double num2= scan.nextDouble();
        char operator=scan.next().charAt(0);
        switch(operator){
            case '+':
                System.out.println("The result for + operator is "+(num1+num2));
                break;
            case '-':
                System.out.println("The result for - operator is "+(num1-num2));
                break;
            case '*':
                System.out.println("The result for * operator is "+(num1*num2));
                break;
            case '/':
                System.out.println("The result for / operator is "+(num1/num2));
                break;
            default:
                System.out.println("Wrong operator");
        }
    }
}
