package pageObjects.DemoQa;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AccordianPage {



    WebDriver driver ;


    @FindBy(xpath = "//span[text()=\"Accordian\"]")
    public WebElement AccordianWidgetButton ;

    @FindBy(xpath = "//div[@id=\"section2Content\"]/p[contains(text(),\"Contrary to popular belief\")]")
    public WebElement secondParagraphContent ;

    @FindBy(id = "section2Heading")
    public WebElement secondPargraphHeading ;

    public AccordianPage(WebDriver driver){
        this.driver = driver ;
        PageFactory.initElements(driver,this);
    }
}
