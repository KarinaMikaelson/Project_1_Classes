package org.example.class19;

/*
Create a Class Student that will have 3
subclasses as SyntaxStudent.
CollegeStudent, SchoolStudent.
• Define 3 common behavior within parent class and override some of the methods in child classes
• Define some methods specific to child classes
• Write example of achieving run time polymorphism
 */
public class Student {
    void study(){
        System.out.println("Student is studying");
    }
    void attendClass(){
        System.out.println("Student attends class");
    }
    void doHomework(){
        System.out.println("Student is doing homework");
    }
}
class SyntaxStudent extends Student{
    void study(){
        System.out.println("Syntax student study Java");
    }
}
class CollegeStudent extends Student{
    void attendClass(){
        System.out.println("College student attends college classes");
    }
    void passExam(){
        System.out.println("College student passed the exam");
    }
}
class SchoolStudent extends Student{
    void doHomework(){
        System.out.println("School student is doing homework");
    }
}
class StudentTester{
    public static void main(String[] args) {
        Student [] arr = {new SyntaxStudent(), new CollegeStudent(), new SchoolStudent()};
        for(int i = 0; i < arr.length; i++){
            Student student = arr[i];
            student.attendClass();
            student.study();
            student.doHomework();
        }
    }
}


