package setup;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class BaseClass {

    public static WebDriver driver;
    ConfigParameter configparameter;


    public void setupBrowser() {

        String browser = configparameter.browser.toLowerCase();

        switch (browser) {
            case "chrome":
                System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") + configparameter.driverPath + "chromedriver.exe");
                driver = new ChromeDriver();
                break;

            case "edge":
                System.setProperty("webdriver.msedge.driver", System.getProperty("user.dir") + configparameter.driverPath + "msedgedriver.exe");
                driver = new EdgeDriver();
        }


    }

    public WebDriver getDriver() {
        return driver;
    }


}


