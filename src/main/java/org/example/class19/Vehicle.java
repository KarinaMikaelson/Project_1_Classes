package org.example.class19;
/*
Polymorphism
 */
public class Vehicle {
    public void go(){

    }

    public static void main(String[] args) {
        Car car = new Car();
        Bicycle bicycle = new Bicycle();
        Boat boat = new Boat();

        Vehicle[] racers = {car,bicycle,boat};

        for(Vehicle x : racers){
            x.go();
        }
    }
}
class Car extends Vehicle{
    public void go(){
        System.out.println("The car begins moving");
    }
}
class Bicycle extends Vehicle{
    public void go(){
        System.out.println("The bicycle begins moving");
    }
}
class Boat extends Vehicle{
    public void go(){
        System.out.println("The boat begins moving");
    }
}
