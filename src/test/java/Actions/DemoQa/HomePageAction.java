package Actions.DemoQa;

import org.junit.Assert;
import org.openqa.selenium.Alert;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import pageObjects.DemoQa.HomePage;
import setup.BaseClass;

import java.time.Duration;
import java.util.ArrayList;

public class HomePageAction {

    WebDriver driver ;
    BaseClass baseClass ;
    HomePage homePage ;

    public HomePageAction(BaseClass baseClass){
        this.baseClass = baseClass ;
        driver = baseClass.getDriver() ;
        homePage = new HomePage(driver);


    }

    public void clickOnAlertWindow(){

        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0,250)", "");

        homePage.AlertWindowSection.click();
    }



}
