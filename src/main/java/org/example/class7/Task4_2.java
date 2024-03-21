package org.example.class7;
/*
Create an array of cars and store 6 elements into it.
Using 2 different loops print all values from the array.
 */
public class Task4_2 {
    public static void main(String[] args) {
        //Second way for Loop
        String [] cars={"Toyota","Porsche","Mercedes","Lexus","Ford","Ferrari"};
        int i=0;
        while(i<5){
            System.out.println(cars[i]);
            i++;
        }
    }
}
