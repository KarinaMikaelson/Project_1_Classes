package org.example.class14;
/*
Create a Class called SyntaxEmployee:
• Create three variables empID, salary and set the CEO to "Sumair"
• Create two obiects of the class
SyntaxEmployee
• Set the value of eID, salary for each of the obiects
• Print out the eID, salary and CEO for each of the obiects
 */
public class SyntaxEmployee {
    int empID;
    int salary;
    static String CEO = "Sumair";

    public static void main(String[] args) {
        SyntaxEmployee e1 = new SyntaxEmployee();
        e1.empID = 1273;
        e1.salary = 8000;
        System.out.println(e1.empID);
        System.out.println(e1.salary);
        System.out.println(e1.CEO);

        SyntaxEmployee e2 = new SyntaxEmployee();
        e2.empID = 745;
        e2.salary = 11000;
        System.out.println(e2.empID);
        System.out.println(e2.salary);
        System.out.println(e2.CEO);

        SyntaxEmployee e3 = new SyntaxEmployee();
        e3.empID = 1263;
        e3.salary = 9000;
        System.out.println(e3.empID);
        System.out.println(e3.salary);
        System.out.println(e3.CEO);
    }
}
