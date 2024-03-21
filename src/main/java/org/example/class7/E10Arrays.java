package org.example.class7;

public class E10Arrays {
    public static void main(String[] args) {

        int [] numbers={10,15,20,25,30,35};
        for(int num:numbers){
            if(num>20){
                System.out.println(num);
                // variable inside the loop (num:) is always the first [0] index
            }
        }
    }
}
