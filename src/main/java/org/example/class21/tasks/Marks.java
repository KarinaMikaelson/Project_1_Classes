package org.example.class21.tasks;
/*
We have to calculate the average of marks obtained in three subjects by student A and in 4 subjects by student B.
Create class 'Marks' with an abstract method 'getAverage' that will be returning the average of marks.
Provide implementation of abstract method in classes 'A' and 'B'. The constructor of student A takes the marks in three
subiects as its parameters and the marks in four subjects as its parameters for student B. Test your code
 */
abstract class Marks {
    abstract double getAverage();
}
class A extends Marks{
    private double english;
    private double history;
    private double math;
    public A(double english, double history, double math){
        this.english = english;
        this.history = history;
        this.math = math;
    }
    @Override
    double getAverage(){
        return (english+history+math)/3;
    }
}
class B extends Marks{
    private double english;
    private double history;
    private double math;
    private double subject4;
    public B(double english, double history, double math, double subject4){
        this.english = english;
        this.history = history;
        this.math = math;
        this.subject4 = subject4;
    }
    @Override
    double getAverage(){
        return (english +history + math+ subject4)/4 ;
    }
}
class MarksTester{
    public static void main(String[] args) {
        A a = new A(4,2,6);
        B b = new B(6,2,4,6);

        System.out.println(a.getAverage());
        System.out.println(b.getAverage());
    }
}