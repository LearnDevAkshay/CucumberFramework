package pageObjects.SwagLab;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class UserDetailPage {

    WebDriver driver ;

    @FindBy(xpath = "//span[text()='Checkout: Your Information']")
    public WebElement checkoutInformationText ;

    public UserDetailPage(WebDriver driver){
        this.driver = driver ;
    }
}
