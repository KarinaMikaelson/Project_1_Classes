package org.example.class6;
/*
Print only odd numbers from 100 to 1
Expected output
99 97 95 93...1
 */
public class Task7 {
    public static void main(String[] args) {

        for(int i=99;i>=1;i-=2){
            //Or use i=i-2 instead
            System.out.print(i+" ");
        }
    }
}
