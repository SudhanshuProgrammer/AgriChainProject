package stepDefinitions;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageObject.LoginPage;

import java.io.File;
import java.nio.file.Files;
import java.nio.file.Paths;

public class Steps {
    private WebDriver driver;
    private LoginPage login; // Declare LoginPage without initializing

    @Before
    public void setUp() {
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        login = new LoginPage(driver); // Initialize here, after driver is created
    }

    @Given("I am on the Instagram login page")
    public void i_am_on_the_instagram_login_page() {
        driver.get("https://www.instagram.com/");
    }

    @When("I enter my username and password")
    public void i_enter_my_username_and_password() {
        login.setUsername("sudhanshupp@gmail.com");
        login.setPassword("Instagram@2025");
    }

    @When("I click on the login button")
    public void i_click_on_the_login_button() throws InterruptedException {
        login.clickLoginButton();
        Thread.sleep(5000);
        driver.findElement(By.xpath("//div[@class='xxz18i5 x17qophe x10l6tqk x13vifvy x1lliihq x14vqqas x1kjsxda x1useyqa']//div//span[@class='x4k7w5x x1h91t0o x1h9r5lt x1jfb8zj xv2umb2 x1beo9mf xaigb6o x12ejxvf x3igimt xarpa2k xedcshv x1lytzrv x1t2pt76 x7ja8zs x1qrby5j']//div[@class='x1n2onr6 x6s0dn4 x78zum5']//a[@role='link']//div[@class='x9f619 x3nfvp2 xr9ek0c xjpr12u xo237n4 x6pnmvc x7nr27j x12dmmrz xz9dl7a xn6708d xsag5q8 x1ye3gou x80pfx3 x159b3zp x1dn74xm xif99yt x172qv1o x10djquj x1lhsz42 xzauu7c xdoji71 x1dejxi8 x9k3k5o xs3sg5q x11hdxyr x12ldp4w x1wj20lx x1lq5wgf xgqcy7u x30kzoy x9jhf4c']//div//div[@class='x9f619 xxk0z11 xii2z7h x11xpdln x19c4wfv xvy4d1p']//*[name()='svg']")).click();
        Thread.sleep(5000);
    }

    @Then("I should be redirected to my profile page")
    public void i_should_be_redirected_to_my_profile_page() throws InterruptedException {
        driver.findElement(By.xpath("//a[contains(text(),'_imsudhanshu')]")).click();
        Thread.sleep(2000);
    }

    @Then("I take a screenshot of my profile page")
    public void i_take_a_screenshot_of_my_profile_page() throws Exception {
        File screenshot = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
        Files.copy(screenshot.toPath(), Paths.get(".//screenshots/profile_page_screenshot.png")); // Save the screenshot
    }

    @When("I can see the count of posts, followers and followings")
    public void i_navigate_to_my_posts() {
        driver.get("https://www.instagram.com/_imsudhanshu/");  // Replace with your Instagram username
        String postCounts = driver.findElement(By.xpath("(//span[@class='x5n08af x1s688f'])[1]")).getText();
        String followers =  driver.findElement(By.xpath("(//span[@class='x5n08af x1s688f'])[2]")).getText();
        String followings =  driver.findElement(By.xpath("(//span[@class='x5n08af x1s688f'])[3]")).getText();
        System.out.println("Number of Posts: " + postCounts);
        System.out.println("Number of followers: " + followers);
        System.out.println("Number of followings: " + followings);
    }

    @Then("Click on Logout button")
    public void clickOnLogoutButton() throws InterruptedException {
        driver.findElement(By.xpath("(//*[name()='svg'][@aria-label='Settings'])[1]")).click();
        Thread.sleep(5000);
        login.clickLogout();
    }

    @When("I search for the username {string}")
    public void i_search_for_the_username(String username) throws InterruptedException {
        driver.get("https://www.instagram.com/" + username + "/");
        Thread.sleep(5000);
    }

    @Then("I should see the posts count for the user {string}")
    public void i_should_see_the_posts_for_the_user(String username) throws InterruptedException {
        String postCount = driver.findElement(By.xpath("(//span[@class='x5n08af x1s688f'])[1]")).getText();
        System.out.println("Number of Posts for user " + username + "are: "+postCount);
        Thread.sleep(2000);
    }

    @Then("I should see the followers count for the user {string}")
    public void i_should_see_the_followers_count_for_the_user(String username) throws InterruptedException {
        String followers = driver.findElement(By.xpath("(//span[@class='x5n08af x1s688f'])[2]")).getText();
        System.out.println("Number of Posts for user " + username + "are: "+followers);
        Thread.sleep(2000);
    }

    // This method checks whether the followings count is displayed
    @Then("I should see the followings count for the user {string}")
    public void i_should_see_the_followings_count_for_the_user(String username) throws InterruptedException {
        String followings = driver.findElement(By.xpath("(//span[@class='x5n08af x1s688f'])[3]")).getText();
        System.out.println("Number of Posts for user " + username + "are: "+followings);
        Thread.sleep(2000);
    }

    @After
    public void tearDown() {
        if (driver != null) {
            driver.quit();  // Close the browser after tests
        }
    }
}