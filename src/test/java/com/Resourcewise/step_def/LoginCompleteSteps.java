package com.Resourcewise.step_def;

import com.Resourcewise.driver.DriverManager;
import com.Resourcewise.pages.LoginCompletePage;
import cucumber.api.java.en.Then;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.Matchers.is;

public class LoginCompleteSteps extends DriverManager {
    LoginCompletePage loginCompletePage = new LoginCompletePage();

    @Then("^I should see log out button displayed$")
    public void i_should_see_log_out_button_displayed() throws Throwable {
       Boolean flag= loginCompletePage.checkLogoutButton();
       assertThat(flag,equalTo(true));
    }
}

