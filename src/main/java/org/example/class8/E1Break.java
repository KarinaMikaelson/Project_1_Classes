package org.example.class8;

public class E1Break {
    public static void main(String[] args) {

        String [] names={"James","Matt","Sandy","Fab","Ana","Silvia"};
        //Serch for "Sandy" if it is present print in console
        String name="Sandy";
        for(String n:names){
            if(n.equals(name)){
                System.out.println("Name is present");
            }
            //Use Loop and IF
            //  OR
            /*
            if(n.equals("Sandy")){
            System.out.println(n+" is present");
             */
        }
    }
}
