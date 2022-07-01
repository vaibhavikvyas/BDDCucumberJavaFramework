package com.Resourcewise.step_def;

import com.Resourcewise.pages.RegistrationComplete;
import cucumber.api.java.en.Then;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalToIgnoringCase;
import static org.hamcrest.Matchers.is;

public class RegistrationCompleteSteps {
    RegistrationComplete registrationComplete=new RegistrationComplete();

    @Then("^I should See Message\"([^\"]*)\"$")
    public void i_should_See_Message(String expectedMessage) throws Throwable {
        String myActualMessage=registrationComplete.getRegistrationCompletedMessage();
        assertThat(myActualMessage,is(equalToIgnoringCase(expectedMessage)));
    }
}
