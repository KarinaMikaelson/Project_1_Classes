package org.example.class12.task6;

public class Task6 {
    void isPalindrome(String originalStr){
        StringBuilder st = new StringBuilder(originalStr);   //StringBuilder is mutable(changeable)
        st.reverse();
        String reversedStr = st.toString();
        if(originalStr.equals(reversedStr)){
            System.out.println("True");
        }else{
            System.out.println("False");
        }
    }
}
