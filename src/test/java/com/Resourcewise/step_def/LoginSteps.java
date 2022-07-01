package com.Resourcewise.step_def;

import com.Resourcewise.driver.DriverManager;
import com.Resourcewise.pages.LoginPage;
import cucumber.api.java.en.Then;

import static org.hamcrest.CoreMatchers.containsString;
import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.*;


public class LoginSteps extends DriverManager {

    LoginPage loginPage = new LoginPage();
    DriverManager driverManager = new DriverManager();

    @Then("^I should see \"([^\"]*)\" text on login page$")
    public void i_should_see_text_on_login_page(String expectedMessage) throws Throwable {

    String myActualWelcomeMessage = loginPage.getWelcomeMessageOnLoginPage();
    assertThat(myActualWelcomeMessage,is(equalToIgnoringCase(expectedMessage)));

    }


    @Then("^I enter email \"([^\"]*)\" and password \"([^\"]*)\"$")
    public void i_enter_email_and_password(String email, String password) throws Throwable {
       loginPage.enterEmailAndPassword(email,password);
    }

    @Then("^I click on log in on login page$")
    public void i_click_on_log_in_on_login_page() throws Throwable {
        loginPage.clickOnLoginButton();

    }




}
