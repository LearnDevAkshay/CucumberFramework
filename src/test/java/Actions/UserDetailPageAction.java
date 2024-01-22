package Actions;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import pageObjects.UserDetailPage;
import setup.BaseClass;

public class UserDetailPageAction {


    WebDriver driver ;
    UserDetailPage userDetailPage ;
    BaseClass baseClass ;


    public UserDetailPageAction(BaseClass baseClass){
        this.baseClass = baseClass;
        this.driver = baseClass.getDriver() ;
        userDetailPage = new UserDetailPage(driver) ;

    }

    public void validateUserDetailPage(){


        try{
            WebElement productTitle =   userDetailPage.checkoutInformationText;
        }catch(Exception e){
            Assert.assertTrue("User Not Navigated to User Detail Page",false);
        }
    }

}
