package com.Resourcewise.step_def;


import com.Resourcewise.driver.DriverManager;
import com.Resourcewise.pages.HomePage;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.endsWith;
import static org.hamcrest.Matchers.is;


public class HomeSteps extends DriverManager {

    DriverManager driverManager=new DriverManager();
    HomePage homePage = new HomePage();

    @Given("^I am on the home page$")
    public void i_am_on_the_home_page() throws Throwable {
    String  copieddUrl= driverManager.copyUrl();
    assertThat(copieddUrl,is(endsWith("nopcommerce.com/")));

}
    @When("^I click on the Log in$")
    public void i_click_on_the_Log_in() throws Throwable {
        homePage.clickOnLoginButton();
    }

    @Given("^I click on the Register$")
    public void i_click_on_the_Register() throws Throwable {
        homePage.clickOnRegisterButton();
    }


}
