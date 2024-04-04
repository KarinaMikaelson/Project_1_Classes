package org.example.class12;

public class PrinterTester {
    public static void main(String[] args) {
        Printer  p = new Printer(); // Create an object first
        p.printHello();
        p.printWorld("Java");
        p.printManyWords(10,"Batch19");
    }
}
