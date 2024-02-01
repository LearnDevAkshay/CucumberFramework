package pageObjects.DemoQa;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ModalDialogsPage {



    WebDriver driver ;


    @FindBy(xpath = "//span[text()=\"Modal Dialogs\"]")
    public WebElement modalDialogWidget ;

    @FindBy(id = "showSmallModal")
    public WebElement smallModalButton ;

    @FindBy(id = "showLargeModal")
    public WebElement largeModalButton ;

    @FindBy(xpath = "//div[@class=\"modal-body\"]")
    public WebElement smallDialogMessage ;

    @FindBy(id = "closeSmallModal")
    public WebElement smallDialogCloseButton ;

    @FindBy(xpath = "//div[@class=\"modal-body\"]")
    public WebElement largeDialogMessage ;

    @FindBy(id = "closeLargeModal")
    public WebElement largeDialogCloseButton ;

    public ModalDialogsPage(WebDriver driver){
        this.driver = driver ;
        PageFactory.initElements(driver,this);
    }
}
