package org.example.class11;

public class Task7 {
    /*
    Create a String that should be combination of letters, numbers and special characters.
    Find out how many Alphabets(abd AZ)
    characters are there in the String.
     */
    public static void main(String[] args) {

        String str = "xwjdfuALHG84aj192An1";
        int alphabetCount = 0;
        for(int i = 0; i < str.length(); i++){
            if(Character.isLetter(str.charAt(i))){
                alphabetCount++;
            }
        }
        System.out.println(alphabetCount);
    }
}