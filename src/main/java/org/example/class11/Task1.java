package org.example.class11;

import java.util.Scanner;

/*
Store username, password and confirm password from a user and check following requirements:
1. Username or Password cannot be empty, if so-> message="Username or Password cannot be empty".
2. Password should be minimum 8 characters, if less -> message="Password is too short".
3. Password cannot contain username if so, - message="Password cannot contain username".
4. Password should match confirmed password, if not -> message="Passwords do not match"
Only after all requirements met - message
"Your username and password has been created"
 */
public class Task1 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter username:");
        String username = scan.nextLine();
        System.out.println("Enter password:");
        String password = scan.nextLine();
        System.out.println("Confirm next password:");
        String confirmPassword = scan.nextLine();

        if(username.isEmpty() || password.isEmpty()){
            System.out.println("Username or Password can not be empty");
        }else if(password.length() < 8){
            System.out.println("Password is too short");
        }else if(password.contains(username)){
            System.out.println("Password can not contain username");
        }else if(!password.equals(confirmPassword)){
            System.out.println("Passwords do not match");
        }
        System.out.println("Your username and password has been created");
    }
}
