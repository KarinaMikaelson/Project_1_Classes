package org.example.class12;
/*
How would you reverse a String word by word? for example
   input=>This is sentence i want to reverse
   output=>sihT si ecnetnes i tnaw ot esrever I
 */
public class Task1ReverseString {
    public static void main(String[] args) {

        String str = "This is sentence i want to reverse";
        String[] strArray = str.split(" ");
        for(String s:strArray){    // loop gives us words one by one
            StringBuilder st = new StringBuilder(s);  // To store words in StringBuilder
            st.reverse();  // Use reverse method
            System.out.print(st+" ");
        }
    }
}
// Here we reverse String by word only!
// Enhance For Loop example here
//Output: sihT si ecnetnes i tnaw ot esrever I