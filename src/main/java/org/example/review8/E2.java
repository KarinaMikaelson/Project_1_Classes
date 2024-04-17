package org.example.review8;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.safari.SafariDriver;

/*
Polymorphism EXAMPLE
 */
public class E2 {
    public static void main(String[] args) throws InterruptedException {

        WebDriver [] browsers = {new ChromeDriver(),new FirefoxDriver(), new SafariDriver()};

        for(WebDriver w:browsers){
            Thread.sleep(1500);
            w.get("https://facebook.com");
            Thread.sleep(1500);
            w.findElement(By.xpath("//input[@id='email']")).sendKeys("Test");
            Thread.sleep(1500);
            w.findElement(By.xpath("//input[@id='pass']")).sendKeys("Test");
            Thread.sleep(1500);
            w.quit();
        }
    }
}
