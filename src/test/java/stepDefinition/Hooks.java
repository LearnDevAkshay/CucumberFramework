package stepDefinition;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import setup.BaseClass;

public class Hooks extends BaseClass {


    @Before
    public void setup(){
        System.out.println("Driver Setup Completed");
        setupBrowser();
    }

    @After()
    public void tearDown(){

        System.out.println("Default After");
        driver.quit() ;

    }



}
