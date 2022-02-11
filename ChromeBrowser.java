package seleniumsessions;

import org.openqa.selenium.WebDriver;


import org.openqa.selenium.chrome.ChromeDriver;


public class ChromeBrowser {
    public static void main(String[] args) throws InterruptedException {


        System.setProperty("webdriver.chrome.driver","/Users/devina/Downloads/chromedriver");
        WebDriver  driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://github.com/mozilla/geckodriver/releases");

        String title = driver.getTitle();
        System.out.println(title);
        Thread.sleep(3000);

        driver.close();


    }

}
