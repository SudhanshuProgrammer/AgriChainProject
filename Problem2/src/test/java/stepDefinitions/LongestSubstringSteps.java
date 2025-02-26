package stepDefinitions;


import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import pageObject.HomePage;
import utils.WebDriverManager;

import static org.junit.Assert.assertEquals;

public class LongestSubstringSteps {

    private WebDriver driver;
    private HomePage homePage;
    private String baseUrl = "https://agrichain.com"; // Base URL for the website.

    @Before // This annotation will initialize the WebDriver before each scenario.
    public void setUp() {
        driver = WebDriverManager.getDriver(); // Initialize the WebDriver using the utility class.
        homePage = new HomePage(driver); // Create an instance of HomePage.
    }

    @Given("I am on the homepage")
    public void i_am_on_the_homepage() {
        driver.get(baseUrl); // Navigate to the home page.
    }

    @When("I enter {string} into the input field")
    public void i_enter_into_the_input_field(String input) {
        homePage.enterInput(input); // Call the method from HomePage to enter input.
    }

    @When("I click the submit button")
    public void i_click_the_submit_button() {
        homePage.clickSubmit(); // Call the method from HomePage to click the submit button.
    }

    @Then("I should see the output {string} on the result page")
    public void i_should_see_the_output_on_the_result_page(String expectedOutput) {
        WebElement resultElement = driver.findElement(By.id("resultId")); // Replace with the actual ID of the result element.
        String actualOutput = resultElement.getText(); // Get the actual output from the result element.
        assertEquals(expectedOutput, actualOutput); // Verify the output.
    }

    @Then("I should see an error message on the result page")
    public void i_should_see_an_error_message_on_the_result_page() {
        WebElement errorMessageElement = driver.findElement(By.id("errorId")); // Replace with the actual ID of the error message element.
        String actualMessage = errorMessageElement.getText(); // Get the error message text.
        assertEquals("Invalid input", actualMessage); // Adjust this to match the actual expected message.
    }

    @After // This annotation will clean up the WebDriver after each scenario.
    public void tearDown() {
        if (driver != null) {
            driver.quit(); // Close the browser if the driver was initialized.
        }
    }
}