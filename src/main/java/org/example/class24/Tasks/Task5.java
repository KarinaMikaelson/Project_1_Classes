package org.example.class24.Tasks;

import java.util.HashSet;
import java.util.Set;

/*
Create a Set that will hold Objects of Student Type. In this set we do not care about the insertion order.
Each student object should have name and studentID. Display name of each student.
 */
public class Task5 {
    public static void main(String[] args) {
        Set<Student> students = new HashSet<>();
        students.add(new Student("John","101"));
        students.add(new Student("Sara","202"));
        students.add(new Student("Kira","303"));
        students.add(new Student("Batty","404"));
        students.forEach(x-> x.getName());
    }
}
class Student{
    private String name;
    private String studentId;
    public Student(String name,String studentId ){
        this.name = name;
        this.studentId = studentId;
    }
    public void getName(){
        System.out.println(name);
    }
}
