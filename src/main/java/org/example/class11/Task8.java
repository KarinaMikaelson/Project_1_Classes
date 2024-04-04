package org.example.class11;

public class Task8 {
    /*
    You have a String a="Is it saturday? Is it raining? Do we have a Java Class today?"
    How would you find out how many sentences are in that String?
     */
    public static void main(String[] args) {

        String a = "Is it saturday? Is it raining? Do we have a Java Class today?";
        int sentencesCount = 0;
        for(int i = 0; i < a.length(); i++){
            char oneChar = a.charAt(i);
            if(oneChar == '.' || oneChar == '!' || oneChar == '?'){
                sentencesCount++;
            }
        }
        System.out.println("Number of sentences is "+sentencesCount);
    }
}
