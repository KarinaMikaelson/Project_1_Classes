package org.example.class2;

public class ESArithmetics {
    public static void main(String[] args) {
        int num1=100;
        int num2=20;
        int result=num1+num2;
        System.out.println(result);
        //outcome 100+20=120
        //Only String performs concatenation
        //All other Variables perform additional +

        byte numByte=18;
        int numInt=92;
        long numLong=384659375L;
        float numFloat= 23.12F;
        System.out.println(numByte+numInt+numLong+numFloat);

        double numD1=100.5;
        double numD2=23.12;
        double resultD=numD1+numD2;
        System.out.println(resultD);

    }
}
