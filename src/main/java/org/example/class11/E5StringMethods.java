package org.example.class11;
/*
String methods
*/
public class E5StringMethods {
    public static void main(String[] args) {

        //String str = new String("Java is easy");
        String st = "Matt like Watermelon. He is in the kitchen";
        System.out.println(st.contains("Matt"));
        System.out.println(st.toLowerCase().contains("matt like watermelon"));
        System.out.println(st.startsWith("M"));
        System.out.println(st.endsWith("kitchen"));
        boolean ends = st.endsWith("again");
        System.out.println(ends);
    }
}
