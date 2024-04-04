package org.example.class12;
/*
How would you reverse a String word by word? for example
   input=>This is sentence i want to reverse
 */
public class Task1n2ReverseString {
    public static void main(String[] args) {

        String str = "This is sentence i want to reverse";
        StringBuilder st = new StringBuilder("This is sentence i want to reverse");
        System.out.println(st.reverse());
    }
}
// Here we convert String to StringBuilder to reverse full sentence
// OUTPUT:  esrever ot tnaw i ecnetnes si sihT