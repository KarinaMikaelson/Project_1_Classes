package org.example.class15;
/*
Constructor
 */
public class Dog {
    String name;
    String color;
    int age;

    Dog(String dName, String dColor, int dAge){
        name = dName;
        color = dColor;
        if(dAge<30){
            age = dAge;
        }else{
            System.out.println("Wrong value");
        }
    }
    void printInformation(){
        System.out.println(name+" "+color+" "+age);
    }

}
