package stepDefinition;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import setup.BaseClass;

public class Hooks extends BaseClass {


    @Before
    public void setup() {

        setupBrowser();
    }

    @After()
    public void tearDown(Scenario scenario) {

        if (scenario.isFailed()) {

            byte[] src = ((TakesScreenshot) driver).getScreenshotAs(OutputType.BYTES);
            scenario.attach(src, "image/png", scenario.getName());
        }

        //driver.quit();

    }


}
