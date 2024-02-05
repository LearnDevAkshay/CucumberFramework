package Actions.DemoQa;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import pageObjects.DemoQa.SliderPage;
import setup.BaseClass;

import java.time.Duration;

public class SliderAction {

    WebDriver driver ;
    BaseClass baseClass ;
    SliderPage sliderPage ;

    public SliderAction(BaseClass baseClass){
        this.baseClass = baseClass ;
        driver =  baseClass.getDriver() ;
        sliderPage = new SliderPage(driver) ;
    }

    public void clickOnSliderWidget(){

        JavascriptExecutor js = (JavascriptExecutor) driver;

        js.executeScript("window.scrollBy(0,250)", "");

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

        wait.until(ExpectedConditions.elementToBeClickable(sliderPage.sliderWidgetButton));

        sliderPage.sliderWidgetButton.click();
    }
    public void setSliderValue() throws InterruptedException {

        Thread.sleep(5000);


        /* There are two ways to do that
        1 Use Click and Hold Method and Move to Location
        2 Move to location and click
         */


        //Method 1
        /*Actions builder = new Actions(driver);
        builder .clickAndHold(sliderPage.sliderButton)
                .moveToLocation(824,326)
                .release()
                .perform();*/


        //Method 2
        Actions builder = new Actions(driver);
        builder
                .moveToLocation(824,326)
                .click()
                .perform();

    }

}
