package org.example.class10;

public class CarTester {
    public static void main(String[] args) {

        Car toyotaCar =  new Car();
        toyotaCar.make = "Toyota";
        toyotaCar.model = "Prius";
        toyotaCar.year = 2024;
        toyotaCar.color = "Red";
        toyotaCar.price = 50000;

        System.out.println(toyotaCar.make);
        System.out.println(toyotaCar.model);
        System.out.println(toyotaCar.year);
        System.out.println(toyotaCar.color);
        System.out.println(toyotaCar.price);

        toyotaCar.turnSignal();
        toyotaCar.turnAc();

        Car fordCar =  new Car();
        fordCar.make = "Ford";
        fordCar.model = "Mustang";
        fordCar.year = 2018;
        fordCar.color = "Black";
        fordCar.price = 12000;

        System.out.println(fordCar.make);
        System.out.println(fordCar.model);
        System.out.println(fordCar.year);
        System.out.println(fordCar.color);
        System.out.println(fordCar.price);

        fordCar.turnSignal();
        fordCar.turnAc();


        Car bmwCar =  new Car();
        bmwCar.make = "Toyota";
        bmwCar.model = "Prius";
        bmwCar.year = 2024;
        bmwCar.color = "Red";
        bmwCar.price = 50000;

        System.out.println(bmwCar.make);
        System.out.println(bmwCar.model);
        System.out.println(bmwCar.year);
        System.out.println(bmwCar.color);
        System.out.println(bmwCar.price);

        bmwCar.turnSignal();
        bmwCar.turnAc();


    }
}
