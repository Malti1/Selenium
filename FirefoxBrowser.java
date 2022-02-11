package seleniumsessions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FirefoxBrowser {
    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.gecko.driver","/Users/devina/Downloads/geckodriver 2");
        WebDriver driver = new FirefoxDriver();
        driver.get("https://www.ebay.co.uk/");
        Thread.sleep(2000);
        
    }}



