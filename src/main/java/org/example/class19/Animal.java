package org.example.class19;
/*
Overriding method
 */
public class Animal {
    public static void main(String[] args) {
    }
    void sleep(){
        System.out.println("Animal sleep");
    }
    void eat(){
        System.out.println("Animals eat");
    }


}
class Dog extends Animal{
    @Override
    void sleep(){
        System.out.println("Dogs like to sleep 6 to 8 hours");
    }
}
class Cat extends Animal{

}
class AnimalTester{

    public static void main(String[] args) {
        Dog dog = new Dog();
        dog.sleep();
        dog.eat();
    }
}