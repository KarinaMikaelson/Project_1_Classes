package org.example.class4;

public class E4NestedIf {
    public static void main(String[] args) {

        boolean mainDoor=true;
        boolean room1=false;
        boolean room2=false;
        // in Nested If - one IF is dependent to another IF
        if(mainDoor){
            if(room1){System.out.println("Tuesday");
                System.out.println("Room 1 is open");
            }else{
                System.out.println("Room 1 is closed");
            }
        }else{
            System.out.println("Main Door is closed");
        }
    }
}
