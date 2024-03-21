package org.example.class4;

public class E5NestedIf {
    public static void main(String[] args) {

        boolean mainDoor=true;
        boolean room1=false;
        boolean room2=false;

        if(mainDoor){

            if(room1){
                System.out.println("Room1");
            }else{
                System.out.println("Room1 is closed");
            }
        }else{
            System.out.println("Main door is closed");
        }
    }
}
