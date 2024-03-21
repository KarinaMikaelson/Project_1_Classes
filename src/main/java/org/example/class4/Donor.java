package org.example.class4;

public class Donor {
    public static void main(String[] args) {

        int age=19;
        int weight=105;

        if(age>=18){
            if(weight>=110){
                System.out.println("You are eligible");
            }
        }else{
            System.out.println("You are NOT eligible");
        }
    }
}
