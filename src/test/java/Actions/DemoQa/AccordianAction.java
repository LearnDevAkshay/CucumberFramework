package Actions.DemoQa;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import pageObjects.DemoQa.AccordianPage;
import setup.BaseClass;

import java.time.Duration;

public class AccordianAction {

    WebDriver driver ;

    BaseClass baseClass ;

    AccordianPage accordianPage ;

    public AccordianAction(BaseClass baseClass){
        this.baseClass = baseClass ;
        driver = baseClass.getDriver() ;
        accordianPage = new AccordianPage(driver);
    }

    public void clickOnAccordianButton(){

        accordianPage.AccordianWidgetButton.click();
    }

    public void clickOnSecondHeading(){

        accordianPage.secondPargraphHeading.click();
    }
    public void validateAccordianParagraph(){

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

        wait.until(ExpectedConditions.visibilityOf(accordianPage.secondParagraphContent)) ;
        System.out.println("Content = "+accordianPage.secondParagraphContent.getText());
    }

}
