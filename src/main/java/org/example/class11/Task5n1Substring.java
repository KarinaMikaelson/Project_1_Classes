package org.example.class11;

public class Task5n1Substring {
    /*
    Write a program that reads two people's first names and if they expecting boy or girl?
    Based on the input suggests a name for a baby:
    Example Output:
    Mom's first name? Mary Dad's first name? Daniel Boy or Girl? boy
    Suggested baby name: DANRY
    Example Output:
    Mom's first name? Mary Dad's first name? Daniel Boy or Girl? girl
    Suggested baby name: MAIEL
     */
    public static void main(String[] args) {

        String momName = "Karina";
        String dadName = "Yevhen";
        boolean isBoy = false;
        if(isBoy){
            String firstHalf = dadName.substring(0,dadName.length()/2);
            String secondHalf = momName.substring(momName.length()/2,momName.length());
            System.out.println(firstHalf+secondHalf);
        }else{
            String firstHalf = momName.substring(0,momName.length()/2);
            String secondHalf = dadName.substring(dadName.length()/2,dadName.length());
            System.out.println(firstHalf+secondHalf);
        }
    }
}
