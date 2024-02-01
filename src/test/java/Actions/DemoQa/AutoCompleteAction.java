package Actions.DemoQa;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;
import pageObjects.DemoQa.AutoCompletePage;
import setup.BaseClass;

public class AutoCompleteAction {

    WebDriver driver ;

    BaseClass baseClass ;

    AutoCompletePage autoCompletePage ;

    public AutoCompleteAction(BaseClass baseClass){
        this.baseClass = baseClass ;

        driver= baseClass.getDriver() ;

        autoCompletePage = new AutoCompletePage(driver);
    }

    public void clickOnAutoCompleteWidget(){

        autoCompletePage.autoCompleteWidgetButton.click();
    }

    public void enterTextIntoAutoComplete() throws InterruptedException {

       //Thread.sleep(5000);

       Actions actions = new Actions(driver) ;

       actions.moveToElement(autoCompletePage.autoCompleteInput).click().sendKeys("White").perform(); ;

        //Thread.sleep(5000);

       // autoCompletePage.autoCompleteInput.click();

      //  Thread.sleep(5000);

       // autoCompletePage.autoCompleteInput.sendKeys("White");

    }

    public void clickOnOption() throws InterruptedException {

        //Thread.sleep(5000);

        Actions actions = new Actions(driver) ;

       // actions.sendKeys(Keys.ENTER) ;

        actions.moveToElement(autoCompletePage.autoCompleteOption).click().perform();
    }


}
