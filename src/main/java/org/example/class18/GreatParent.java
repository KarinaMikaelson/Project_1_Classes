package org.example.class18;

public class GreatParent{
    GreatParent(){
        System.out.println("Grand Parent");
    }
}
class P extends GreatParent{
    P(){
        System.out.println("Parent");
    }
}
class C extends P{
    C(){
        System.out.println("Child");
    }
}
class GreatParentTester{
    public static void main(String[] args) {
        C c = new C();
    }
}