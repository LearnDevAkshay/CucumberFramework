package stepDefinition;

import Actions.CheckoutPageAction;
import Actions.HomePageActions;
import Actions.UserDetailPageAction;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;


public class AddToCartStepDefinition {

    HomePageActions homePageActions ;
    CheckoutPageAction checkoutPageAction ;
    UserDetailPageAction userDetailPageAction;

    public AddToCartStepDefinition(HomePageActions homePageActions,
                                   CheckoutPageAction checkoutPageAction,
                                   UserDetailPageAction userDetailPageAction){

        this.userDetailPageAction=userDetailPageAction;
        this.homePageActions = homePageActions;
        this.checkoutPageAction = checkoutPageAction ;
    }



    @When("user clicks on Add to cart button")
    public void user_clicks_on_add_to_cart_button() throws InterruptedException {

        homePageActions.clickOnAddToCartButton();
    }
    @When("user clicks on cart link")
    public void user_clicks_on_cart_link() {
        homePageActions.clickonCartLink();
    }
    @When("user is navigated to checkout page")
    public void user_is_navigated_to_checkout_page() {

        checkoutPageAction.validateCheckoutPage();

    }
    @When("user checks on checkout button")
    public void user_checks_on_checkout_button() {

        checkoutPageAction.clickOnCheckoutButton();
    }
    @Then("user is navigated to user detail page")
    public void user_is_navigated_to_user_detail_page() throws InterruptedException {

       userDetailPageAction.validateUserDetailPage();
       Thread.sleep(5000);
    }

}
