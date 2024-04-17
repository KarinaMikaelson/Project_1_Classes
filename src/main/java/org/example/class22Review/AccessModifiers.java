package org.example.class22Review;

public class AccessModifiers {
    public static void main(String[] args) {
        AccessModifiers a = new AccessModifiers();
        System.out.println(a.password);
        System.out.println(a.email);
        System.out.println(a.userName);
        System.out.println(a.name);
    }
    private String password = "Pass123";
    String email = "3hdhjdfjed@ujfdj";
    protected String userName= "user123";
    public String name = "JHgFfd";

    void printInfo(){
        // within the same class
        System.out.println(name);
        System.out.println(userName);
        System.out.println(email);
        System.out.println(password);
    }
}
class Two extends AccessModifiers{
    // Can not use PRIVATE only (different classes)
    void printInfo(){
        System.out.println(name);
        System.out.println(userName);
        System.out.println(email);
        //System.out.println(password);
    }

    public static void main(String[] args) {
        AccessModifiers a = new AccessModifiers();
        //System.out.println(a.password);
        System.out.println(a.email);
        System.out.println(a.userName);
        System.out.println(a.name);
    }
}
