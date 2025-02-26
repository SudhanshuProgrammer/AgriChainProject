package pageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class HomePage {
    private WebDriver driver;

    // Locators
    private By inputField = By.id("inputFieldId"); // Assuming the ID locator
    private By submitButton = By.id("submitButtonId"); // Assuming the ID locator

    public HomePage(WebDriver driver) {
        this.driver = driver;
    }

    public void enterInput(String input) {
        WebElement inputEl = driver.findElement(inputField);
        inputEl.clear();
        inputEl.sendKeys(input);
    }

    public void clickSubmit() {
        WebElement submitEl = driver.findElement(submitButton);
        submitEl.click();
    }
}