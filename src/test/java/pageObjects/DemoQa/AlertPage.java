package pageObjects.DemoQa;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AlertPage {

    WebDriver driver;

    @FindBy(xpath = "//span[text()='Alerts']")
    public WebElement alertWidgetButton;

    @FindBy(id = "alertButton")
    public WebElement simpleAlert;

    @FindBy(id = "timerAlertButton")
    public WebElement timerAlert;

    @FindBy(id = "confirmButton")
    public WebElement confirmButtonAlert;

    @FindBy(id = "promtButton")
    public WebElement promtButton;

    public AlertPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }
}
