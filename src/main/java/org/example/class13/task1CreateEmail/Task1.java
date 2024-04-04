package org.example.class13.task1CreateEmail;
/*
Create a method createEmail0. Based on values of users firstName, lastName and email type,
your method should return complete email Address. Example: createEmail(John, Snow, gmail)
-> johnsnow@gmail.com
 */
public class Task1 {
    String createEmail(String firstName, String lastName, String emailType){
        String email = firstName + lastName + "@"+ emailType+ ".com";
        return email;   // when it is not void, return- keyword must be at the end
    }
}

