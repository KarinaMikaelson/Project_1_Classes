package org.example.class12.task7;

public class Task7 {
    void helloInDifferentLanguages(String country){
        switch (country){
            case "Kazakhstan":
                System.out.println("Salem!");
                break;
            case "Japan":
                System.out.println("Kon'nichiwa!");
                break;
            case "Russia":
                System.out.println("Привет!");
                break;
            case "South Korea":
                System.out.println("Annyeonghaseyo!");
                break;
            case "France":
                System.out.println("Bonjour!");
                break;
            default:
                System.out.println("Wrong country");
        }
    }
}
