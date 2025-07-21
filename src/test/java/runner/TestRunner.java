package runner;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.AfterClass;
import org.junit.runner.RunWith;
import pages.BasePage;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src/test/resources/features",// directory from .features files
        glue = "steps",// Scans the project for step definitions and associates them with the corresponding steps in the feature files
        plugin = {"pretty","html:target/cucumber-reports"},
        tags = "@NewPayee"
)


public class TestRunner {
    @AfterClass
    public static void cleanDriver() //Clear webdriver variable
    {
        BasePage.closeBrowser();  //System will close browser after testing finished
    }
}