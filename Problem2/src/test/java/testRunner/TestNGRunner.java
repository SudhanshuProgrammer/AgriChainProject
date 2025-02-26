package testRunner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(features = ".//AgrichainFeatureFiles/Longest_substring.feature",
        glue = {"stepDefinitions"},
        plugin = {"pretty", "html:target/cucumber-report.html", "json:target/cucumber.json"},
        monochrome = true,
        publish = true,
        dryRun = false // Use true for dry run, ensure to set to false for actual run
)
public class TestNGRunner extends AbstractTestNGCucumberTests {
}