package stepDefinition.DemoQa;

import Actions.DemoQa.FrameAction;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Frame {

    FrameAction frameAction;


    public Frame(FrameAction frameAction) {
        this.frameAction = frameAction;
    }

    @When("user click on frame widget button")
    public void user_click_on_frame_widget_button() {
        frameAction.clickOnFrameWidget();
    }

    @Then("user read frame content")
    public void user_read_frame_content() {
        frameAction.validateSimpleFrame();
    }

    @Then("user read complex frame content")
    public void user_read_complex_frame_content() {
        frameAction.validateComplexFrame();
    }

    @When("user click on nested frame widget button")
    public void user_click_on_nested_frame_widget_button() {
        frameAction.clickOnNestedFrameWidget();
    }

    @Then("user read the nested frame content")
    public void user_read_the_nested_frame_content() {
        frameAction.validateNestedFrame();
    }

}
