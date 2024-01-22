package Actions;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import pageObjects.HomePage;
import setup.BaseClass;

public class HomePageActions {

    WebDriver driver ;

     HomePage homepage ;

    BaseClass baseclass ;

    public HomePageActions(BaseClass baseClass){
        this.baseclass = baseClass;
        this.driver = baseclass.getDriver() ;
        homepage = new HomePage(driver);
    }

    public  void validateHomePage(){
        try{
            WebElement productTitle =  homepage.productListTitle;
        }catch(Exception e){
            Assert.assertTrue("User Not Navigated to Home Page",false);
        }
    }

    public  void clickOnAddToCartButton() throws InterruptedException {
        homepage.addToCartButton.click();

    }
    public void clickonCartLink(){
        homepage.cartLink.click();
    }

}
