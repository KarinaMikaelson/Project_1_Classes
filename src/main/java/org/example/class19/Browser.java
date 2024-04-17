package org.example.class19;

class Browser {
    void openBrowser(){
        System.out.println("Opening Browser");
    }
    void openWeb(){
        System.out.println("Loading the website");
    }
    void performTesting(){
        System.out.println("Performing the testing");
    }
    void closeBrowser(){
        System.out.println("Closing Browser");
    }
}
class Chrome extends Browser{
    void openBrowser(){
        System.out.println("Opening Chrome");
    }
    void closeBrowser(){
        System.out.println("Closing Chrome");
    }
}
class FireFox extends Browser{
    void openBrowser(){
        System.out.println("Opening FireFox");
    }
    void closeBrowser(){
        System.out.println("Closing FireFox");
    }
}
class Safari extends Browser{
    void openBrowser(){
        System.out.println("Opening Safari");
    }
    void closeBrowser(){
        System.out.println("Closing Safari");
    }
}
class BrowserTester{
    public static void main(String[] args) {
        Chrome chrome = new Chrome();
        chrome.openBrowser();
        chrome.openWeb();
        chrome.performTesting();
        chrome.closeBrowser();

        FireFox fireFox = new FireFox();
        fireFox.openBrowser();
        fireFox.openWeb();
        fireFox.performTesting();
        fireFox.closeBrowser();

        Safari safari = new Safari();
        safari.openBrowser();
        safari.openWeb();
        safari.performTesting();
        safari.closeBrowser();

    }

}