package Actions.SwagLab;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import pageObjects.SwagLab.HomePage;
import setup.BaseClass;

public class HomePageAction {

    WebDriver driver ;

     HomePage homepage ;

    BaseClass baseclass ;

    public HomePageAction(BaseClass baseClass){
        this.baseclass = baseClass;
        this.driver = baseclass.getDriver() ;
        homepage = new HomePage(driver);
    }

    public  void validateHomePage(){
        try{
            String productTitle =  homepage.productListTitle.getText();

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
