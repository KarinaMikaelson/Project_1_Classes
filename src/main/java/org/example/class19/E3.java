package org.example.class19;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class E3 {
    public static void main(String[] args) {

        //ChromeDriver chromeDriver = new ChromeDriver();
        //FirefoxDriver firefoxDriver = new FirefoxDriver();
        //firefoxDriver.navigate().to("https://amazon.com");
        //chromeDriver.navigate().to("https://facebook.com");
        WebDriver [] arr = {new ChromeDriver(),new FirefoxDriver()};
        for(int i = 0; i < arr.length; i++){
            WebDriver webDriver = arr[i];
            webDriver.navigate().to("https://facebook.com");
        }
    }
}
