package pageObjects;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {

    WebDriver driver ;

    @FindBy(xpath="//span[@class='title' and contains(text(),'Products')]")  public WebElement productListTitle ;
    @FindBy(xpath = "(//div[text()='Sauce Labs Backpack']/following::div[@class='inventory_item_price']/following::button)[1]")
    public WebElement addToCartButton;

    @FindBy(xpath = "//a[@class='shopping_cart_link']")
    public WebElement cartLink ;

    public HomePage(WebDriver driver){

        this.driver = driver ;
        PageFactory.initElements(driver,this);
    }


}
