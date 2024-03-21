package org.example.class10;

public class DogTester {
    public static void main(String[] args) {
        /*
        We have created a variable dogObj1 which has a data type Dog we are creating
        the object of Dog and we are storing it in dogObj1 variable.
         */

        // Dog - data type
        // dogObj1  -  variable
        //  new Dog() - creating an object
        Dog dogObj1 = new Dog();
        dogObj1.name = "Loki";   // creating an object (actual dog)
        dogObj1.breed = "Stray";
        dogObj1.color = "Black/white";
        dogObj1.age = 3;
        dogObj1.weight = 4;
            System.out.println(dogObj1.name);
            System.out.println(dogObj1.breed);
            System.out.println(dogObj1.color);
            System.out.println(dogObj1.age);
        dogObj1.bark();
        dogObj1.sleep();
        dogObj1.eat();
        // I've created 1 dog


        Dog dog2 = new Dog();
        dog2.name = "Milo";
        dog2.breed = "Stray";
        dog2.color = "Brown/white";
        dog2.age = 4;
        dog2.weight = 5;
            System.out.println(dog2.name);
            System.out.println(dog2.breed);
            System.out.println(dog2.color);
            System.out.println(dog2.age);
        dogObj1.bark();
        dogObj1.sleep();
        dogObj1.eat();


    }
}
