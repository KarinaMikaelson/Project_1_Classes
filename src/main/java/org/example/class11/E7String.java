package org.example.class11;

public class E7String {
    public static void main(String[] args) {
     /*
     charAt method - to pick one character from the string
     count how many times the letter "t" appear
     */
        String str = "Mat is going to regret soon";
        System.out.println(str.charAt(2));
        for(int i = 0; i < str.length(); i++){
            System.out.print(str.charAt(i));
        }
        System.out.println();
        int count = 0;
        for(int i = 0; i < str.length();i++){
            if(str.charAt(i) == 't' || str.charAt(i) == 'T'){
                count++;
            }
        }
        System.out.println("Numbers of t letter in text is: "+ count);
    }
}
