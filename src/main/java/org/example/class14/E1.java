package org.example.class14;
/*
 Types of Variables
 */
public class E1 {
   String name;   // not local variable
   int age;      // not local variable
   int add(int a, int b){   // not local variable
       return a+b;

   }

   void printNumber(int number){    // local variable
       if(number > 10){
           int sum = 30;   // local variable
       }
   }
   public static void main(String[] args){    // local variable
       int sum =30;
       int base =sum + 45;
       System.out.println(base);
   }

}
