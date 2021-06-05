package TestRunner;

import org.junit.runner.RunWith;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
    features = "src/test/java/Features",
    glue = "StepDefinitions",
    tags = "@Activity1_1",
    plugin = { "pretty", "html:target/cucumber-reports/reports.html" },
    monochrome = true
)

public class testRunner {
    //empty
}