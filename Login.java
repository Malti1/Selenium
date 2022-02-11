package seleniumsessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Login {
    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver", "/Users/devina/Downloads/chromedriver");
        WebDriver driver= new ChromeDriver();
        driver.get("https://demo.nopcommerce.com/");
        driver.manage().window().maximize();
        Thread.sleep(2000);
        driver.findElement(By.className("ico-login")).click();
        driver.findElement(By.id("Email")).sendKeys("ritika_rimi@yahoo.com");
        driver.findElement(By.id("Password")).sendKeys("Rainbow123");
        //Thread.sleep(2000);
        driver.findElement(By.className("login-button")).click();
        Thread.sleep(2000);
        driver.close();




    }
}
