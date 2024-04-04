package org.example.class13.task1CreateEmail;

public class Task1Tester {
    public static void main(String[] args) {
        Task1 t1 = new Task1();
        String email = t1.createEmail("John","Snow","Gmail");
        System.out.println(email.toLowerCase());
    }
}
