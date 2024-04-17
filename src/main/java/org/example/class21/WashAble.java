package org.example.class21;

import org.example.class19.Degree;

/*
INTERFACE
 */
public interface WashAble {
    public static final String name = "Loki";
    void wash();
}
class Animal{

}
class Dog extends Animal implements WashAble{
    @Override
    public void wash(){
        System.out.println("You can wash a dog");
    }
}
class Sofa implements WashAble{
    @Override
    public void wash(){
        System.out.println("You can wash sofa");
    }
}
class WashAbleTester{
    public static void main(String[] args) {
        Dog d = new Dog();
        Sofa s = new Sofa();
        d.wash();
        s.wash();

        WashAble[] washAbles = {new Dog(),new Sofa()};
        for(WashAble w:washAbles){
            w.wash();
        }
    }
}
