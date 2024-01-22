package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CheckoutPage {

    WebDriver driver ;

    @FindBy(xpath="//span[text()='Your Cart']")
    public WebElement cartText ;

   @FindBy(id="checkout")
   public WebElement checkoutButton ;


    public CheckoutPage(WebDriver driver){
        this.driver = driver ;
        PageFactory.initElements(driver,this);
    }
}
