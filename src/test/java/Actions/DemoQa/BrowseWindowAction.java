package Actions.DemoQa;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import pageObjects.DemoQa.BrowseWindowPage;
import setup.BaseClass;

import java.time.Duration;
import java.util.ArrayList;

public class BrowseWindowAction {

    WebDriver driver ;

    BaseClass baseClass ;

    BrowseWindowPage browseWindowPage;


    public BrowseWindowAction(BaseClass baseClass){
        this.baseClass = baseClass ;
        this.driver = baseClass.getDriver();
        browseWindowPage = new BrowseWindowPage(driver);

    }

    public void clickOnBrowseWindowButton(){


        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10)) ;
        wait.until(ExpectedConditions.elementToBeClickable(browseWindowPage.browseWindowButton));
        browseWindowPage.browseWindowButton.click();
    }

    public void clickOnNewTabButton(){
        browseWindowPage.newTabButton.click();
    }

    public void clickOnNewWindowButton(){
        browseWindowPage.windowButton.click();
    }

    public void clickonNewWindowMessageButton(){
        browseWindowPage.newWindowMessageButton.click();
    }

    public void switchToNewTab(){


        ArrayList<String> tabs = new ArrayList<String>(driver.getWindowHandles());

        System.out.println(driver.getWindowHandle());
        System.out.println(driver.getCurrentUrl());

        System.out.println("Window 1 "+tabs.get(0));
        System.out.println("Window 2 "+tabs.get(1));

        driver.switchTo().window(tabs.get(1)) ;

        System.out.println(driver.getWindowHandle());



    }

    public void validateNewWindow(){

        String newWindowText =  browseWindowPage.newTabText.getText() ;

        System.out.println(newWindowText);

        Assert.assertEquals("Not Navigated to New Window",newWindowText,"This is a sample page");

    }

    public void validateNewMessageWindow(){

        System.out.println(driver.getPageSource()) ;

      //  String msg = browseWindowPage.newMessageWindowText.getText();

     //   System.out.println(msg);
    }

    public void switchToNewWindow(){

     //   System.out.println("Old Page "+driver.getPageSource()) ;

        for(String winHandle : driver.getWindowHandles()){
            driver.switchTo().window(winHandle);

        }
        


    }


}
