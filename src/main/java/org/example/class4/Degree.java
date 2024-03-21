package org.example.class4;

public class Degree {
    public static void main(String[] args) {
        boolean degree=false;
        float score=2.3f;

        if(degree){
            System.out.println("Congratulations!");
            if(score>=3.5){
                System.out.println("You are eligible for scholarship");
            }else{
                System.out.println("You should have studied harder");
            }
        }else{
            System.out.println("You should get a degree");
        }
    }
}
