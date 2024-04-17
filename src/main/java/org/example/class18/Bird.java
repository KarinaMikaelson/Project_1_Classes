package org.example.class18;
/*
Create a Bird class create 4 fields and use the
Bird class as parent class and create 2 classes
Using it one sparrow and one parrot use constructors make fields private and define
printInfo methods as well create the object of each class and call the methods
 */
public class Bird {
    private String breed;
    private String color;
    private String country;
    private int population;
    public Bird(String breed, String color, String country, int population){
        this.breed = breed;
        this.color = color;
        this.country = country;
        this.population = population;
    }
    public void printBirdInfo(){
        System.out.println(breed+" "+color+" "+country+" "+population);
    }
}
class Sparrow extends Bird{
    public Sparrow(String breed, String color, String country, int population){
        super(breed,color,country,population);
    }
}
class Parrot extends Bird{
    public Parrot(String breed, String color, String country, int population){
        super(breed,color,country,population);
    }
}
class BirdTester{
    public static void main(String[] args) {
        Sparrow s = new Sparrow("Sparrow","Blue","Spain",3800);
        s.printBirdInfo();
        Parrot p = new Parrot("Parrot","Yellow","Africa",59000);
        p.printBirdInfo();
    }
}