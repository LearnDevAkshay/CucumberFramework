package stepDefinition.DemoQa;

import Actions.DemoQa.DatePickerAction;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class DatePicker {


    DatePickerAction datePickerAction;

    public DatePicker(DatePickerAction datePickerAction){
        this.datePickerAction = datePickerAction ;
    }

    @When("user click on date picker widget section")
    public void user_click_on_date_picker_widget_section() {
       datePickerAction.clickOnDatePickerWidget();
    }
    @Then("user enters date into input box")
    public void user_enters_date_into_input_box() throws InterruptedException {
      datePickerAction.enterDate();
    }
}
