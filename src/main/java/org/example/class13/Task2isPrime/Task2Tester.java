package org.example.class13.Task2isPrime;

public class Task2Tester {
    public static void main(String[] args) {
        Task2 t2 = new Task2();
        int number = 11;
        boolean isPrime = t2.isPrimeCheck(number);
        if(isPrime){
            System.out.println(number+" is a prime number");
        }else{
            System.out.println(number+" is not prime");
        }
    }
}
