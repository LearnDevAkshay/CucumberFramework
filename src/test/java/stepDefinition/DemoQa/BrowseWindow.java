package stepDefinition.DemoQa;

import Actions.DemoQa.BrowseWindowAction;
import Actions.DemoQa.CommonActions;
import Actions.DemoQa.HomePageAction;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class BrowseWindow {

    CommonActions commonActions ;
    HomePageAction homePageAction ;

    BrowseWindowAction browseWindowAction ;

    public BrowseWindow(CommonActions commonActions,
                        HomePageAction homePageAction,
                        BrowseWindowAction browseWindowAction){

        this.commonActions = commonActions ;
        this.homePageAction = homePageAction ;
        this.browseWindowAction = browseWindowAction ;

    }

    @Given("user is on demoqa website")
    public void user_is_on_demoqa_website() throws InterruptedException {
        commonActions.navigateToUrl();
        Thread.sleep(5000) ;
    }

    @Given("user click on AlertWindow")
    public void user_click_on_alertWindow() throws InterruptedException {

        homePageAction.clickOnAlertWindow();

        }

    @Given("user click on BrowseWindow")
    public void user_click_on_browseWindow() throws InterruptedException {

        browseWindowAction.clickOnBrowseWindowButton();
    }

    @When("user click on new tab button")
    public void user_click_on_new_tab_button() throws InterruptedException {

        browseWindowAction.clickOnNewTabButton();

    }
    @Then("new tab will open")
    public void new_tab_will_open() {

        browseWindowAction.switchToNewTab();

        browseWindowAction.validateNewWindow();

    }

    @When("user click on new window button")
    public void user_click_on_new_window_button() {
        browseWindowAction.clickOnNewWindowButton();
    }
    @Then("new window will open")
    public void new_window_will_open() {

        browseWindowAction.switchToNewTab();

        browseWindowAction.validateNewWindow();

    }
    @When("user click on new message window button")
    public void user_click_on_new_message_window_button() {

        browseWindowAction.clickonNewWindowMessageButton();
    }
    @Then("new window with message will open")
    public void new_window_with_message_will_open() {

        browseWindowAction.switchToNewWindow();




    }


}
