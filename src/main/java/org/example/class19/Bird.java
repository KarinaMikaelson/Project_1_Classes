package org.example.class19;
/*
Polymorphism
 */

public class Bird {
    public void sing(){
        System.out.println("tweet tweet tweet");
    }
}
class Robin{
    public void sing(){
        System.out.println("twiddledeedee");
    }
}
class Pelican extends Bird{
    public void sing(){
        System.out.println("kuaik kuaik");
    }
}
class BirdTester{
    public static void main(String[] args) {
        Pelican pelican = new Pelican();
        pelican.sing();
        Robin robin = new Robin();
        robin.sing();
    }
}





