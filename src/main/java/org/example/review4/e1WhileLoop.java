package org.example.review4;

public class e1WhileLoop {
    public static void main(String[] args) {

        String name = "Josh";
        while (name.equals("Josh")){   // = true condition
            System.out.println("Hello Josh");
            name = "Matt"; // name was changed inside the loop
            // That is why it is still true
        }
    }
}
