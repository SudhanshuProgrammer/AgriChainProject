package utils;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebDriverManager {
    public static WebDriver getDriver() {
//        System.setProperty("webdriver.chrome.driver", "Drivers/chromedriver"); // Adjust for your path
        return new ChromeDriver();
    }
}