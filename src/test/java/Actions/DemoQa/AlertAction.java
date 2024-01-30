package Actions.DemoQa;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import pageObjects.DemoQa.AlertPage;
import setup.BaseClass;

import java.time.Duration;

public class AlertAction {

    WebDriver driver;
    BaseClass baseClass;

    AlertPage alertPage;


    public AlertAction(BaseClass baseClass) {
        this.baseClass = baseClass;
        driver = baseClass.getDriver();
        alertPage = new AlertPage(driver);

    }

    public void clickOnAlertWidgetButton() {
        alertPage.alertWidgetButton.click();
    }

    public void clickOnSimpleAlert() {
        alertPage.simpleAlert.click();
    }

    public void clickOnTimerAlert() {
        alertPage.timerAlert.click();
    }

    public void clickOnConfirmAlert() {
        alertPage.confirmButtonAlert.click();
    }

    public void inputAlert() {
        alertPage.promtButton.click();
    }

    public void acceptTheAlert() {

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

        wait.until(ExpectedConditions.alertIsPresent());

        driver.switchTo().alert().accept();
    }

    public void enterTextIntoAlert() {


        driver.switchTo().alert().sendKeys("My Name");

        driver.switchTo().alert().accept();

    }


}
