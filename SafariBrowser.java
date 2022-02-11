package seleniumsessions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.safari.SafariDriver;

public class SafariBrowser {

    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.safari.driver","/usr/bin/safaridriver");
        WebDriver driver  = new SafariDriver();

        Thread.sleep(3000);
        driver.close();


    }
}
