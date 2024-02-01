package pageObjects.DemoQa;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DatePickerPage {

    WebDriver driver ;

    @FindBy(xpath = "//span[text()=\"Date Picker\"]")
    public WebElement datePickerWidget ;

    @FindBy(id = "datePickerMonthYearInput")
    public WebElement datePickerInput ;

    @FindBy(id = "dateAndTimePickerInput")
    public WebElement dateAndTimePickerInput ;

    public DatePickerPage(WebDriver driver){
        this.driver = driver ;
        PageFactory.initElements(driver,this);

    }


}
