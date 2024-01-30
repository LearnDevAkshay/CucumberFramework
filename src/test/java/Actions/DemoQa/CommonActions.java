package Actions.DemoQa;

import org.openqa.selenium.WebDriver;
import setup.BaseClass;
import setup.ConfigParameter;

public class CommonActions {

    BaseClass baseClass;

    WebDriver driver;

    ConfigParameter configParameter;

    public CommonActions(BaseClass baseClass) {

        this.baseClass = baseClass;

        driver = baseClass.getDriver();

    }

    public void navigateToUrl() {

        driver.navigate().to(configParameter.seleniumTestingUrl);

        driver.manage().window().maximize();
    }


}
