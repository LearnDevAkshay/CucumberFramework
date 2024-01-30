package stepDefinition.DemoQa;

import Actions.DemoQa.AlertAction;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Alert {

    AlertAction alertAction;


    public Alert(AlertAction alertAction) {
        this.alertAction = alertAction;
    }

    @Given("user click on Alerts widget button")
    public void user_click_on_alerts_widget_button() {
        alertAction.clickOnAlertWidgetButton();
    }

    @When("user click in alert button")
    public void user_click_in_alert_button() {
        alertAction.clickOnSimpleAlert();
    }

    @Then("Alert will pop up")
    public void alert_will_pop_up() {
        alertAction.acceptTheAlert();
    }

    @When("user click in alert button with delay")
    public void user_click_in_alert_button_with_delay() {
        alertAction.clickOnTimerAlert();
    }

    @When("user click in alert button with confirm box")
    public void user_click_in_alert_button_with_confirm_box() {
        alertAction.clickOnConfirmAlert();
    }

    @Then("Alert will pop up and user will click on confirm")
    public void alert_will_pop_up_and_user_will_click_on_confirm() {
        alertAction.acceptTheAlert();
    }

    @When("user click in alert button with input box")
    public void user_click_in_alert_button_with_input_box() {
        alertAction.inputAlert();
    }

    @Then("Alert will pop up and user will enter text in pop up box")
    public void alert_will_pop_up_and_user_will_enter_text_in_pop_up_box() {
        alertAction.enterTextIntoAlert();
    }
}
