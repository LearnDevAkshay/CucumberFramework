package pageObjects.DemoQa;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

public class AutoCompletePage {


    WebDriver driver ;

    @FindBy(xpath = "//span[text()=\"Auto Complete\"]")
    public WebElement autoCompleteWidgetButton ;

    @FindBy(xpath = "//*[@id=\"autoCompleteMultipleContainer\"]/div/div[1]/div")
    public WebElement autoCompleteInput ;

    @FindBy(id = "react-select-2-option-0")
    public WebElement autoCompleteOption ;

    public AutoCompletePage(WebDriver driver){
        this.driver = driver ;
        PageFactory.initElements(driver,this);

    }
}
