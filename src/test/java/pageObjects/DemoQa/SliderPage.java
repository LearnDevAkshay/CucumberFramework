package pageObjects.DemoQa;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SliderPage {


    WebDriver driver ;

    @FindBy(xpath = "//span[text()=\"Slider\"]")
    public WebElement sliderWidgetButton ;

    @FindBy(xpath = "//input[@type=\"range\"]")
    public WebElement sliderButton ;

    //767 343

    public SliderPage(WebDriver driver){
        this.driver = driver ;
        PageFactory.initElements(driver,this);
            }
}
