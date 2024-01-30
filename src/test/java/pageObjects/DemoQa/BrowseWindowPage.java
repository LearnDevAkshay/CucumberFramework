package pageObjects.DemoQa;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.PageFactoryFinder;

public class BrowseWindowPage {

    @FindBy(xpath = "//span[text()=\"Browser Windows\"]")
    public WebElement browseWindowButton;

    @FindBy(id = "tabButton")
    public WebElement newTabButton;

    @FindBy(id = "windowButton")
    public WebElement windowButton;

    @FindBy(id = "messageWindowButton")
    public WebElement newWindowMessageButton;

    @FindBy(id = "sampleHeading")
    public WebElement newTabText;

    @FindBy(xpath = "//body")
    public WebElement newMessageWindowText;

    WebDriver driver;

    public BrowseWindowPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

}
