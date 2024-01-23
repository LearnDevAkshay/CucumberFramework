package stepDefinition;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import setup.BaseClass;

public class Hooks extends BaseClass {


    @Before
    public void setup(){

        setupBrowser();
    }

    @After()
    public void tearDown(){


        driver.quit() ;

    }



}
