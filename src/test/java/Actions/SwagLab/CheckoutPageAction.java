package Actions.SwagLab;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import pageObjects.SwagLab.CheckoutPage;
import setup.BaseClass;

public class CheckoutPageAction {

    WebDriver driver ;

    CheckoutPage checkoutpage ;

    BaseClass baseclass ;

    public CheckoutPageAction(BaseClass baseClass){
        this.baseclass=baseClass;
        this.driver = baseclass.getDriver() ;
        checkoutpage = new CheckoutPage(driver);
    }

    public void validateCheckoutPage(){
        try{
            WebElement productTitle =  checkoutpage.cartText;
        }catch(Exception e){
            Assert.assertTrue("User Not Navigated to Checkout Page",false);
        }
    }

    public void clickOnCheckoutButton(){

        checkoutpage.checkoutButton.click();
    }
}
