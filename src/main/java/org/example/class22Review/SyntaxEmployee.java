package org.example.class22Review;
/*
 Create a Class called SyntaxEmployee:
• Create three variables empID, salary and set the CEO to "Sumair"
• Create two obiects of the class
SyntaxEmployee
• Set the value of eID, salary for each of the obiects
• Print out the eID, salary and CEO for each of the obiects
 */
public class SyntaxEmployee {
    public static void main(String[] args) {
        SyntaxEmployee obj1 = new SyntaxEmployee("123",3000);
        SyntaxEmployee obj2 = new SyntaxEmployee("456",7000);
        System.out.println(obj1.empID+" "+obj1.salary+" "+CEO);
        System.out.println(obj2.empID+" "+obj2.salary+" "+CEO);
    }
    private String empID;
    private double salary;
    private static final String CEO = "Sumair";
    public SyntaxEmployee(String empID, double salary){
        this.empID = empID;
        this.salary = salary;
    }
}
