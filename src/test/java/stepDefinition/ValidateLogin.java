package stepDefinition;

import Actions.CommonAction;
import Actions.HomePageActions;
import Actions.LoginPageActions;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;



public class ValidateLogin {

    CommonAction commonAction ;
    LoginPageActions loginPageActions ;
    HomePageActions homePageActions ;




    public ValidateLogin(LoginPageActions loginPageActions,
                         HomePageActions homePageActions,
                         CommonAction commonAction){

        this.loginPageActions = loginPageActions ;
        this.homePageActions = homePageActions ;
        this.commonAction = commonAction;

    }

    @Given("user is on Login page using browser")
    public void userIsOnLoginPageUsing() {


          commonAction.navigateToUrl();

    }

    @When("user enters {string} and {string}")
    public void user_enters_and(String userId, String passWord) {

        loginPageActions.enterUserId(userId);
        loginPageActions.enterPassword(passWord);
        loginPageActions.clickSubmitButton();




    }
    @Then("User navigate to home page")
    public void user_navigate_to_home_page() throws InterruptedException {


     homePageActions.validateHomePage();


    }




}
