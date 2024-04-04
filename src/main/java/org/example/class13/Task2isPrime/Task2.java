package org.example.class13.Task2isPrime;
/*
Write a method to return whether given number is prime or not?
 */
public class Task2 {
    boolean isPrimeCheck(int number){
        if( number <= 1){
            return false;
        }
        for (int i = 2; i <= number / 2; i++)
            if (number % i == 0){
                return false;
            }
        return true;
    }
}
