package org.example.review8;

public class PolymorphismExample {
    public static void main(String[] args) {

            Animal myDog = new Dog(); // Polymorphism: Dog object treated as Animal type
            Animal myCat = new Cat(); // Polymorphism: Cat object treated as Animal type

            myDog.makeSound(); // Output: Woof
            myCat.makeSound(); // Output: Meow
        }
    }
    class Animal {
        public void makeSound() {
            System.out.println("Some sound");
        }
    }

    class Dog extends Animal {
        @Override
        public void makeSound() {
            System.out.println("Woof");
        }
    }
    class Cat extends Animal {
        @Override
        public void makeSound() {
            System.out.println("Meow");
        }
}

