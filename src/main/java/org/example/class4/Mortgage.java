package org.example.class4;

public class Mortgage {
    public static void main(String[] args) {

        double rate=6.5f;
        double price=28468;

        if(rate>4.5){
            System.out.println("User will not buy a house");
        }else{
            System.out.println("User will consider");
            if(price>100000){
                System.out.println("User will take a loan");
            }else{
                System.out.println("User will pay cash");
            }
        }
    }
}
