package org.example.class25.Tasks;

import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

/*
Create a Map that will store Employee name and salary.
Write a logic to retrieve an employee who gets the highest salary.
Output should be in the below format
John Smith=$100000
 */
public class Employee {
    public static void main(String[] args) {
        Map<String,Integer> employees = new TreeMap<>();
        employees.put("Joe Bide",4500);
        employees.put("Sara Power",2000);
        employees.put("John Smith",100000);
        System.out.println(employees);
        Set<Map.Entry<String,Integer>> entrySet = employees.entrySet();

        String highestPaidEmployee = "";
        int highestSalary = Integer.MIN_VALUE;

        for (Map.Entry<String, Integer> entry : employees.entrySet()) {
            if (entry.getValue() > highestSalary) {
                highestSalary = entry.getValue();
                highestPaidEmployee = entry.getKey();
            }
        }

        // Outputting the employee with the highest salary
        System.out.println(highestPaidEmployee + "=$" + highestSalary);
    }
}


