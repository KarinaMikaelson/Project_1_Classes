package org.example.class11;
/*
Methods: length , toUppercase, toLowerCase
 */
public class E2String {
    public static void main(String[] args) {

        String str = new String("Java is Easy");
        String st ="Java is easy";
        // better use second way, string is special in Java
        System.out.println(st.length());
        System.out.println(st.toUpperCase()); // just to print
        String upper = st.toUpperCase();  // to store in variable to use the variable later
        System.out.println(upper);
        System.out.println(st.toLowerCase());
    }
}
