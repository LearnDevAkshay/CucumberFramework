package pageObjects.DemoQa;

import Actions.DemoQa.FrameAction;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class FramePage {

    WebDriver driver;

    @FindBy(xpath = "//span[text()='Frames']")
    public WebElement frameWidget;

    @FindBy(id = "sampleHeading")
    public WebElement simpleFrame;

    @FindBy(id = "sampleHeading")
    public WebElement complexFrame;

    @FindBy(xpath = "//span[text()=\"Nested Frames\"]")
    public WebElement nestedFrame;

    @FindBy(xpath = "//*[text()=\"Parent frame\"]")
    public WebElement parentFrameText;

    @FindBy(xpath = "//*[text()=\"Child Iframe\"]")
    public WebElement childFrameText;

    @FindBy(xpath = "//div[@id=\"framesWrapper\"]/div[1]")
    public WebElement nestedParentFrame;

    @FindBy(xpath = "//iframe[contains(@srcdoc,\"Child Iframe\")]")
    public WebElement childFrame;

    public FramePage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }
}
