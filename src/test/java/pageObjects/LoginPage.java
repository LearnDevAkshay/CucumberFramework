package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {

    WebDriver driver ;
    @FindBy(id="user-name") public WebElement userIdInput;
    @FindBy(id="password") public WebElement passWordInput;
    @FindBy(id="login-button") public WebElement loginButton;


    public LoginPage(WebDriver driver){

        this.driver = driver ;
        PageFactory.initElements(driver,this);
    }





}
