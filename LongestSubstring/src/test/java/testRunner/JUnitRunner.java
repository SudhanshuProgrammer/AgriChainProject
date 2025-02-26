package testRunner;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(features = ".//Features",
        glue = {"stepDefinitions"},
        plugin = {"pretty", "html:target/cucumber-report", "json:target/cucumber.json"},
        monochrome = true,
        publish = true,
        dryRun = false, // Use true for dry run, ensure to set to false for actual run
        tags  = "@sanity or @regression" // "@sanity or @regression"
)

public class JUnitRunner {
}