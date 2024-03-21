package org.example.class8;

public class E2Continue {
    public static void main(String[] args) {
        int [] numbers={10,20,30,55,45,35,50,100};

        for(int num:numbers){
            if(num>50){
                continue; // If i dont want to continue if the number is >50
            }
            System.out.println(num+10);
            System.out.println(num*10);
            System.out.println(num/10);
            System.out.println(num%10);
            System.out.println(num*20);
            System.out.println("****");
        }
    }
}
