package stepDefinition.DemoQa;

import Actions.DemoQa.SliderAction;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Slider {

    SliderAction sliderAction ;


    public Slider(SliderAction sliderAction){
        this.sliderAction = sliderAction ;
    }

    @When("user click on slider widget section")
    public void user_click_on_slider_widget_section() {
       sliderAction.clickOnSliderWidget();
    }
    @Then("user sets slider to")
    public void user_sets_slider_to() throws InterruptedException {
      sliderAction.setSliderValue();
    }

}
