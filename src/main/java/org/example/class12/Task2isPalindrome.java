package org.example.class12;
/*
How would you check if String is palindrome or not? aba=> true
Abbc =>false
 */
public class Task2isPalindrome {
    public static void main(String[] args) {

        String originalStr = "aba";
        StringBuilder st = new StringBuilder(originalStr);   //StringBuilder is mutable(changeable)
        st.reverse();
        String reversedStr = st.toString();
        if(originalStr.equals(reversedStr)){
            System.out.println("True");
        }else{
            System.out.println("False");
        }

        String originalStr2 = "abbs";
        StringBuilder st2 = new StringBuilder(originalStr2);
        st2.reverse();
        String reversedStr2 = st2.toString();
        if(reversedStr2.equals(originalStr2)){
            System.out.println("True");
        }else{
            System.out.println("False");
        }
    }
}
