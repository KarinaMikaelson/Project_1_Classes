package org.example.class12.task7;
/*
Create a method that will say Hello in different language based on
the country that will passed when method is executed.
Do it for any five countries
 */
public class Task7Tester {
    public static void main(String[] args) {
        Task7 t7 =new Task7();
        t7.helloInDifferentLanguages("Kazakhstan");
        t7.helloInDifferentLanguages("France");
    }
}
