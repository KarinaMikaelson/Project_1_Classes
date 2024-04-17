package org.example.class21;

import org.checkerframework.checker.units.qual.C;

/*
Create a WebDriver Interface that will have the following unimplemented behaviour:
openBrowser),
closeBrowser0, maximizeWindow0, findElement). Create 2 classes that implements
WebDriver interface:
ChromeDriver and FirefoxDriver.
 */
public interface WebDriver {
    void openBrowser();
    void closeBrowser();
    void maximizeWindow();
    void findElement(String locator);
}
class ChromeDriver implements WebDriver{
    @Override
    public void openBrowser(){
        System.out.println("Opening Chrome browser");
    }
    @Override
    public void closeBrowser(){
        System.out.println("Closing Chrome browser");
    }
    @Override
    public void maximizeWindow(){
        System.out.println("Maximizing Chrome window");
    }
    @Override
    public void findElement(String locator){
        System.out.println("Finding element in Chrome using locator: "+locator);
    }
}
class FirefoxDriver implements WebDriver{
    @Override
    public void openBrowser(){
        System.out.println("Opening Firefox browser");
    }
    @Override
    public void closeBrowser(){
        System.out.println("Closing Firefox browser");
    }
    @Override
    public void maximizeWindow(){
        System.out.println("Maximizing Firefox window");
    }
    @Override
    public void findElement(String locator){
        System.out.println("Finding element in Firefox using locator: "+locator);
    }
}
class WebDriverTester{
    public static void main(String[] args) {
        WebDriver c = new ChromeDriver();
        c.openBrowser();
        c.closeBrowser();
        c.maximizeWindow();
        c.findElement("xpath");

        WebDriver f = new FirefoxDriver();
        f.openBrowser();
        f.closeBrowser();
        f.maximizeWindow();
        f.findElement("id");

        WebDriver[] webDrivers = {new ChromeDriver(),new FirefoxDriver()};
        for(WebDriver wd:webDrivers){
            wd.openBrowser();
            wd.closeBrowser();
            wd.maximizeWindow();
        }
    }
}
