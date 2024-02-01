package stepDefinition.DemoQa;

import Actions.DemoQa.AutoCompleteAction;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class AutoComplete {

    AutoCompleteAction autoCompleteAction ;

    public AutoComplete(AutoCompleteAction autoCompleteAction){

        this.autoCompleteAction = autoCompleteAction ;
    }

    @Given("user click on auto complete widget section")
    public void user_click_on_auto_complete_widget_section() {

        autoCompleteAction.clickOnAutoCompleteWidget();
    }
    @When("user enters text into input box")
    public void user_enters_text_into_input_box() throws InterruptedException {

        autoCompleteAction.enterTextIntoAutoComplete();
    }
    @Then("user click on auto complete suggestion")
    public void user_click_on_auto_complete_suggestion() throws InterruptedException {
      autoCompleteAction.clickOnOption();
    }
}
