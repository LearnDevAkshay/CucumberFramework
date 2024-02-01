package stepDefinition.DemoQa;

import Actions.DemoQa.AccordianAction;
import Actions.DemoQa.HomePageAction;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Accordian {

    HomePageAction homePageAction ;

    AccordianAction accordianAction;

    public Accordian(HomePageAction homePageAction,
                     AccordianAction accordianAction){

        this.homePageAction = homePageAction ;
        this.accordianAction = accordianAction ;

    }


    @Given("user click on Widget Section")
    public void user_click_on_widget_section() {
       homePageAction.clickOnWidgetWindowSection();
    }
    @Given("user click on accordian Widget button")
    public void user_click_on_accordian_widget_button() {
         accordianAction.clickOnAccordianButton();
    }
    @When("user click on closed paragraph")
    public void user_click_on_closed_paragraph() {

           accordianAction.clickOnSecondHeading();
    }
    @Then("paragraph will expand with content")
    public void paragraph_will_expand_with_content() {
       accordianAction.validateAccordianParagraph();
    }
}
