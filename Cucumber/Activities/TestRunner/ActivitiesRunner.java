package TestRunner;

import org.junit.runner.RunWith;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
    features = "src/test/java/Features",
    glue = {"stepDefinitions"},
    tags = "@activity2_4"
    //plugin= {"html:Reports/HTML_Reports/report.html"}
    //plugin = { "pretty", "html:target/cucumber-reports/reports.html" },
    //monochrome = true
)

public class ActivitiesRunner {
    //empty
}
