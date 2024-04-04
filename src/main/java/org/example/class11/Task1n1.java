package org.example.class11;

public class Task1n1 {
    public static void main(String[] args) {

        String userName = "Admin";
        String password = "Pass12345";
        String confirmPassword = "Pass12345";

        if(userName.isEmpty() || password.isEmpty()){
            System.out.println("Username or Password can not be empty");
        }else if(password.length() < 8){
            System.out.println("Password is too short");
        }else if(password.contains(userName)){
            System.out.println("Password can not contain username");
        }else if(!password.equals(confirmPassword)){
            System.out.println("Passwords do not match");
        }
        System.out.println("Your username and password has been created");
    }
}
