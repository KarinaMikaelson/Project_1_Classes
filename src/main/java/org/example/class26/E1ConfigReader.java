package org.example.class26;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
/*
First (long) way to read the file
 */

public class E1ConfigReader {
    public static void main(String[] args) throws IOException {
        // Location of the file
        String path = "/Users/karina/IdeaProjects/SDETJavaBatch19/Files/Config.properties";
        //Navigate and bring the file into the RAM
        // Create an Object to get config file into java
        FileInputStream fis = new FileInputStream(path);
        // should get an error at first FileInputStream(path);
        //A class which knows how file works

        Properties properties = new Properties();
        //Properties class - only for congif files
        properties.load(fis);
        System.out.println(properties.getProperty("url"));
        //If i want to open the url from the file
        System.out.println(properties.getProperty("password"));
    }
}
