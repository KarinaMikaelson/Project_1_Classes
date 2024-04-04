package org.example.class14;
/*
Create a Class called Students
• Create three variables Name
ID and numberOfStudents
• Create three objects of the
Students Class
Set the value for studentName, studentID and increment the numberOfStudents for each object
Print out total number of
students
 */
public class Students {
    String name;
    int ID;
    static int numberOfStudents = 0;


    public static void main(String[] args) {
        Students student1 = new Students();
        student1.name = "Alan";
        student1.ID = 123;
        Students.numberOfStudents++;

        System.out.println(student1.name+student1.ID);


        Students student2 = new Students();
        student2.name = "Karem";
        student2.ID = 456;
        Students.numberOfStudents++;
        System.out.println(student2.name+student2.ID);


        Students student3 = new Students();
        student3.name = "Indy";
        student3.ID = 789;
        Students.numberOfStudents++;
        System.out.println(student3.name+student3.ID);
        System.out.println(Students.numberOfStudents);

    }
}
