package org.example.class17;

public class E {
    static void printF(){
        System.out.println("Inside class E");
    }
}
class F extends E{
    void callStaticF(){
        E.printF();
    }

    public static void main(String[] args) {
        F f = new F();
        f.callStaticF();
    }
}
