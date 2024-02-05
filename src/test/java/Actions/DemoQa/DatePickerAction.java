package Actions.DemoQa;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import pageObjects.DemoQa.DatePickerPage;
import setup.BaseClass;

public class DatePickerAction {


    WebDriver driver ;
    BaseClass baseClass ;

    DatePickerPage datePickerPage ;

    public DatePickerAction(BaseClass baseClass){

        this.baseClass = baseClass ;

        driver = baseClass.getDriver();

        datePickerPage = new DatePickerPage(driver);

    }

    public void clickOnDatePickerWidget(){

        datePickerPage.datePickerWidget.click();
    }
    public void enterDate() throws InterruptedException {


        /*

        There are three ways to pick date
        1. Use Sendkeys to type control + A and Sendkeys to replace existing date
        2. Use Action class to type control + A and Sendkeys to replace existing date
        3. Use WebElement and actions to select the date and year in calander

         */

        Thread.sleep(5000);

        datePickerPage.datePickerInput.click();

        // Method 1

       // datePickerPage.datePickerInput.sendKeys(Keys.CONTROL+"A");


        //Method 2

       /* Actions actions = new Actions(driver);

        actions.keyDown(Keys.CONTROL)
                .sendKeys("a")
                .keyUp(Keys.CONTROL)
                .perform();

                datePickerPage.datePickerInput.sendKeys("02/08/2024");

                */




        //Method 3
        Select selectYear = new Select(driver.findElement(By.xpath("//select[@class=\"react-datepicker__year-select\"]")));

        selectYear.selectByVisibleText("2022");

        Select selectMonth =  new Select(driver.findElement(By.xpath("//select[@class=\"react-datepicker__month-select\"]"))) ;

        selectMonth.selectByVisibleText("July");

        driver.findElement(By.xpath("//div[@class=\"react-datepicker__week\"]/div[text()=\"8\"]")).click();

    }
}
