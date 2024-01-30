package Actions.DemoQa;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import pageObjects.DemoQa.FramePage;
import setup.BaseClass;

import java.time.Duration;

public class FrameAction {


    WebDriver driver;

    BaseClass baseClass;

    FramePage framePage;

    public FrameAction(BaseClass baseClass) {

        this.baseClass = baseClass;

        driver = baseClass.getDriver();

        framePage = new FramePage(driver);
    }


    public void clickOnFrameWidget() {
        framePage.frameWidget.click();
    }

    public void validateSimpleFrame() {

        driver.switchTo().frame("frame1");

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

        wait.until(ExpectedConditions.visibilityOf(framePage.simpleFrame));

        Assert.assertEquals("Not moved to frame", framePage.simpleFrame.getText(), "This is a sample page");


    }

    public void validateComplexFrame() {
        driver.switchTo().frame("frame2");

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

        wait.until(ExpectedConditions.visibilityOf(framePage.complexFrame));

        Assert.assertEquals("Not moved to frame", framePage.complexFrame.getText(), "This is a sample page");

        driver.switchTo().parentFrame();

        System.out.println(driver.findElement(By.xpath("//div[@id=\"framesWrapper\"]/div[1]")).getText()); // Moved to parent html
    }

    public void clickOnNestedFrameWidget() {
        framePage.nestedFrame.click();
    }

    public void validateNestedFrame() {

        driver.switchTo().frame("frame1");

        String parentFrameText = framePage.parentFrameText.getText();

        Assert.assertEquals("Not Switched to Parent Frame", parentFrameText, "Parent frame");

        //There are two ways to switch to child frame

        WebElement childFrame = framePage.childFrame; //First Way is using Switch to WebElement

        driver.switchTo().frame(childFrame);

        //Second Way is using index
        //driver.switchTo().frame(0);

        Assert.assertEquals("Not Moved to child frame ", framePage.childFrameText.getText(), "Child Iframe");

       /*

        Using Default Content, driver will navigate to original html
        driver.switchTo().defaultContent() ;

        */

        driver.switchTo().parentFrame(); //Back to parent

        Assert.assertEquals("Not Switched to Parent Frame", parentFrameText, "Parent frame");

        driver.switchTo().parentFrame(); // Back to original

        Assert.assertTrue("Not Moved to original Page", framePage.nestedParentFrame.getText().contains("Sample Nested Iframe page"));

    }
}
