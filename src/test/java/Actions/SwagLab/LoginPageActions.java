package Actions.SwagLab;

import org.openqa.selenium.WebDriver;
import pageObjects.SwagLab.LoginPage;
import setup.BaseClass;

public class LoginPageActions {

    WebDriver driver ;

     LoginPage loginpage ;

    BaseClass baseClass ;

    public LoginPageActions(BaseClass baseClass){
        this.baseClass = baseClass ;
        this.driver = baseClass.getDriver() ;
        loginpage = new LoginPage(driver) ;

    }

    public  void enterUserId(String userId){

        loginpage.userIdInput.sendKeys(userId);
    }

    public  void enterPassword(String password){

        loginpage.passWordInput.sendKeys(password);
    }

    public  void clickSubmitButton(){

        loginpage.loginButton.click();
    }
}
