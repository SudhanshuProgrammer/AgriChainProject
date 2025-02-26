package pageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class LoginPage {

    private WebDriver ldriver; // Make this private

    public LoginPage(WebDriver rdriver) {
        this.ldriver = rdriver; // Initialize WebDriver
        PageFactory.initElements(ldriver, this); // Ensure proper initialization
    }

    @FindBy(xpath = "//button[@type='submit']")
    @CacheLookup
    private WebElement btnLogin;

    @FindBy(xpath = "//input[@name='username']")
    @CacheLookup
    private WebElement txtUsername;

    @FindBy(xpath = "//input[@name='password']")
    @CacheLookup
    private WebElement txtPassword;

    @FindBy(xpath = "//span[contains(text(),'Log out')]")
    @CacheLookup
    private WebElement btnLogOut;

    @FindBy(xpath = "(//span[@class='x5n08af x1s688f'])[1]")
    @CacheLookup
    private WebElement posts;

    @FindBy(xpath = "(//span[@class='x5n08af x1s688f'])[2]")
    @CacheLookup
    private WebElement followers;

    @FindBy(xpath = "(//span[@class='x5n08af x1s688f'])[3]")
    @CacheLookup
    private WebElement followings;

    // Action methods
    public void setUsername(String username) {
        txtUsername.sendKeys(username);
    }

    public void setPassword(String pwd) {
        txtPassword.sendKeys(pwd);
    }

    public void clickLoginButton() {
        btnLogin.click();
    }

    public void clickLogout() {
        btnLogOut.click();
    }


}