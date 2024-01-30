package cucumberOptions;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src/test/java/features/SwagLab",
        glue = {"stepDefinition"},
        dryRun = false,
        tags = "@NewMessageWindow",
        plugin = "json:target/jsonReports/cucumber-report.json"

)

public class SwagLabTestRunner {


}
