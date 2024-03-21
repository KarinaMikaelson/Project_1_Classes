package org.example.class8;

public class E1Break_2 {
    public static void main(String[] args) {

        String [] names={"James","Matt","Sandy","Fab","Ana","Silvia"};
        String name="Sandy";
        for(String n:names){
            if(n.equals("Sandy")){
                System.out.println(name+" is present");
                break;
                //Use break; - to stop the Loop
            }
    }
    }

}
