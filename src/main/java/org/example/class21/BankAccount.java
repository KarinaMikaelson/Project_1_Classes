package org.example.class21;
/*
setter methods
getter methods
 */
public class BankAccount {
    private String name;
    private String userName;
    private String password;
    public BankAccount(String name, String userName, String password){
        this.name = name;
        this.userName = userName;
        this.password = password;
    }
    void setName(String name){
        this.name = name;
    }
    public String getName(){
        return name;
    }
}
class BankAccountTester{
    public static void main(String[] args) {
        BankAccount b = new BankAccount("Loki","User123","pass123");
        System.out.println(b.getName());
        b.setName("James");
        System.out.println(b.getName());
    }
}