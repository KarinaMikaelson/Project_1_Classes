package org.example.class18;
/*
Child class has to have matched constructor as Parent class
 */
public class Animal {
    private String name;
    private String color;
    private int age;
    private double weight;
    public Animal(String name, String color, int age, double weight){
        this.name = name;
        this.color = color;
        this.age = age;
        this.weight = weight;
    }
    void printInfo(){
        System.out.println(name+" "+color+" "+age+" "+weight);
    }
}

class Dog extends Animal{
    // This is Child class matching constructor
    Dog(String name, String color, int age, double weight){
        super(name,color,age,weight);
    }
}
class AnimalTester{
    public static void main(String[] args) {
        Dog d = new Dog("James","Black",2,5);
        d.printInfo();
    }

}



