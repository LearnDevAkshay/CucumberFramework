package Actions.DemoQa;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
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

        //datePickerPage.datePickerInput.clear();

        //datePickerPage.datePickerInput.sendKeys("02/05/2024");

        Thread.sleep(5000);

        datePickerPage.datePickerInput.click();

        Select selectYear = new Select(driver.findElement(By.xpath("//select[@class=\"react-datepicker__year-select\"]")));

        selectYear.selectByVisibleText("2022");

        Select selectMonth =  new Select(driver.findElement(By.xpath("//select[@class=\"react-datepicker__month-select\"]"))) ;

        selectMonth.selectByVisibleText("July");

        driver.findElement(By.xpath("//div[@class=\"react-datepicker__week\"]/div[text()=\"8\"]")).click();



    }
}
