package org.example.class4;

public class Month {
    public static void main(String[] args) {

        int month=7;
        System.out.println(month);
        if(month<0){
            System.out.println(month+" is negative");
        }else{
            System.out.println(month+" is positive");
        }
        if(month%2==0){
            System.out.println(month+" is even");
        }else{
            System.out.println(month+" is odd");
        }
    }
}
