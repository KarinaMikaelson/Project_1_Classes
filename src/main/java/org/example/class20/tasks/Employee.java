package org.example.class20.tasks;

/*
Develop a system to manage different types of employees in a company.
Base class: Employee with fields like name, id, and department, and abstract methods calculateSalary() and reportWork().
SubcLasses: FullTimeEmployee, PartTime&mployee, Intern with specific implementations of calculateSalary() based on their employment type.
For example, FullTimeEmployee might include a fixed salary, whereas PartTimemployee salary might depend on the hours worked.
Tester class: EmployeeManagementTester to showcase calculating salaries and reporting work for different employee types.
 */
public abstract class Employee {
    private String name;
    private String id;
    private String department;
    abstract double calculateSalary(int hours);
    abstract void reportWork();
}
class FullTimeEmployee extends Employee{
    @Override
    double calculateSalary(int hors){
        return 6000;
    }
     void reportWork(){
        System.out.println("Report monthly");
    }

}
class PartTimeEmployee extends Employee{
    @Override
    double calculateSalary(int hours){
        return hours*50;
    }
    void reportWork(){
        System.out.println("Report biweekly");
    }

}
class Intern extends Employee{
    @Override
    double calculateSalary(int hours){
        return hours*10;
    }
    void reportWork(){
        System.out.println("Report hourly");
    }
}
class EmployeeTester{
    public static void main(String[] args) {
        Employee[] ems = {new FullTimeEmployee(), new PartTimeEmployee(), new Intern()};
        for(int i = 0; i < ems.length; i++){
            Employee e = ems[i];
            e.calculateSalary(35*4);
            e.reportWork();
        }
    }
}
