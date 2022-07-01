package com.Resourcewise.step_def;

import com.Resourcewise.driver.DriverManager;
import cucumber.api.java.en.Then;

import static org.hamcrest.CoreMatchers.containsString;
import static org.hamcrest.MatcherAssert.assertThat;

public class CommonSteps extends DriverManager {

DriverManager driverManager = new DriverManager();

    @Then("^the url should contain with \"([^\"]*)\"$")
    public void the_url_should_contain_with(String expectedUrl) throws Throwable {
        String myActualUrl = driverManager.copyUrl();
        assertThat(myActualUrl,containsString(expectedUrl));
    }
}
