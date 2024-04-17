package org.example.class22Review;
/*
Create a Class called Students
• Create three variables Name,
ID and numberOfStudents
• Create three obiects of the
Students Class
• Set the value for studentName, studentID and increment the numberOfStudents for each obiect
• Print out total number of students
 */
public class Students {
    public static void main(String[] args) {
        Students student1 = new Students("John","123");
        Students student2 = new Students("Macy","456");
        Students student3 = new Students("Lora","567");
        System.out.println("Total number of students: "+numberOfStudents);
    }
    private String name;
    private String id;
    private static int numberOfStudents = 0;
    public Students(String name, String id){
        this.name = name;
        this.id = id;
        numberOfStudents++;
    }
}
