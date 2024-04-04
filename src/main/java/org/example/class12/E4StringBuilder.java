package org.example.class12;

public class E4StringBuilder {
    public static void main(String[] args) {

        StringBuilder s = new StringBuilder();
        /*
        In this case is better to use StringBuilder, to avoid computer searching for the same data 10000 times
         */
        for(int i = 0; i < 10000; i++){
            s.append(i);
        }
    }
}
