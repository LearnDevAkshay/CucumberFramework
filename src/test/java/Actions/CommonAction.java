package Actions;

import org.openqa.selenium.WebDriver;
import setup.BaseClass;
import setup.ConfigParameter;

public class CommonAction {

    WebDriver driver ;

    BaseClass baseclass ; ;

    ConfigParameter configparameter ;




    public CommonAction(BaseClass baseClass){
        this.baseclass = baseClass ;
        driver = baseclass.getDriver();
    }



    public void navigateToUrl(){

        driver.get(configparameter.url);

        driver.manage().window().maximize();
    }





}
