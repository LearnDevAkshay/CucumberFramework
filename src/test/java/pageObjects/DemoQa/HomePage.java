package pageObjects.DemoQa;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {

    @FindBy(xpath = "//h5[text()='Alerts, Frame & Windows']/parent::div")
    public WebElement AlertWindowSection;

    @FindBy(xpath = "//h5[text()=\"Widgets\"]/parent::div")
    public WebElement widgetWindowSection ;


    WebDriver driver;

    public HomePage(WebDriver driver) {

        this.driver = driver;

        PageFactory.initElements(driver, this);
    }
}
