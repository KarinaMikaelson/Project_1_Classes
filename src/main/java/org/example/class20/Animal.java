package org.example.class20;
/*
Polymorphism
 */

public abstract class Animal {
    public abstract void sleep();

    public void eat(){
        System.out.println("Eating....");
    }
    public void speak(){
        System.out.println("Speaking......");
    }
}
class Dog extends Animal{
    @Override
    public void sleep(){
        System.out.println("ZZZZzzzz");
    }
    @Override
    public void eat(){
        System.out.println("Dogs like to eat meat");
    }
    @Override
    public void speak(){
        System.out.println("Wuff Wuff");
    }
}
class Cat extends Animal{
    @Override
    public void sleep(){
        System.out.println("zzzz");
    }
}

