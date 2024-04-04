package org.example.class16;
/*
Constructor
 */
public class Employee {
    private String name;
    private String id;
    private int age;
    private double salary;

    //constructor
    public Employee(String eName, String eId, int eAge){
        name = eName;
        id = eId;
        if(eAge < 98){
            age = eAge;
        }else{
            System.out.println("Not allowed");
        }

    }
    public Employee(String eName, String eId, int eAge, double eSalary){
        name = eName;
        id = eId;
        if(eAge < 98){
            age = eAge;
        }else{
            System.out.println("Not allowed");
        }
        salary = eSalary;
    }

    void printName(){
        System.out.println(name);
    }
    void printId(){
        System.out.println(id);
    }
    void printAge(){
        System.out.println(age);
    }
    void printSalary(){
        System.out.println(salary);
    }
    void printInfo(){
        System.out.println(name+" "+id+" "+age+" "+salary);
    }
}
