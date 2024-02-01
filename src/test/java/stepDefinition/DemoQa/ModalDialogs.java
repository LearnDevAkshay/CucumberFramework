package stepDefinition.DemoQa;

import Actions.DemoQa.ModalDialogsAction;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class ModalDialogs {


    ModalDialogsAction modalDialogsAction ;

    public ModalDialogs(ModalDialogsAction modalDialogsAction){
        this.modalDialogsAction = modalDialogsAction ;
    }

    @Given("user click on modal dialogs widget button")
    public void user_click_on_modal_dialogs_widget_button() {
        modalDialogsAction.clickOnModalDialogsWidget();
    }

    @When("user click on small dialog button")
    public void user_click_on_small_dialog_button() {
        modalDialogsAction.clickOnSmallModalButton();
    }
    @Then("small dialog will pop")
    public void small_dialog_will_pop() {
       modalDialogsAction.validateSmallDialog();
    }

    @When("user click on large dialog button")
    public void user_click_on_large_dialog_button() {
        modalDialogsAction.clickOnLargeModalButton();
    }
    @Then("large dialog will pop")
    public void large_dialog_will_pop() {
        modalDialogsAction.validateBigDialog();
    }
}
