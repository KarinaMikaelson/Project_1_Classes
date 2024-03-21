package org.example.class10;

public class BankUserTester {
    public static void main(String[] args) {

        BankUser bankUser1 = new BankUser();
        bankUser1.city = "Amsterdam";
        bankUser1.occupancy = "Engineer";
        bankUser1.maritalStatus = "Single";
        bankUser1.creditScore = 789;
        bankUser1.salary = 60000;

        System.out.println(bankUser1.city);
        System.out.println(bankUser1.occupancy);
        System.out.println(bankUser1.maritalStatus);
        System.out.println(bankUser1.creditScore);
        System.out.println(bankUser1.salary);

        bankUser1.giveLoan();
        bankUser1.noLoan();

    }
}
