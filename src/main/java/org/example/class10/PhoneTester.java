package org.example.class10;

public class PhoneTester {
    public static void main(String[] args) {

        Phone phone1 = new Phone();
        phone1.model = "iPhone";
        phone1.color = "Black";
        phone1.price = 1455;
        phone1.year = 2024;
        phone1.memory = 455;

        System.out.println(phone1.model);
        System.out.println(phone1.color);
        System.out.println(phone1.price);
        System.out.println(phone1.year);
        System.out.println(phone1.memory);

        phone1.pressCall();
        phone1.pressMute();
        phone1.tapTwiceScreen();
    }
}
