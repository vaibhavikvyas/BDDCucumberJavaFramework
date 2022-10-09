package com.Resourcewise.step_def;

import com.Resourcewise.pages.RegisterPage;
import cucumber.api.DataTable;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

import java.util.List;
import java.util.Map;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalToIgnoringCase;
import static org.hamcrest.Matchers.is;

public class RegisterSteps {
    RegisterPage registerPage = new RegisterPage();

    @Given("^I select Gender Female$")
    public void i_select_Gender_Female() throws Throwable {
        registerPage.clickOnGenderFemale();

    }

    @Given("^I Enter FirstName \"([^\"]*)\"$")
    public void i_Enter_FirstName(String firstName) throws Throwable {
        registerPage.enterFirstName(firstName);
    }

    @Given("^I enter LastName \"([^\"]*)\"$")
    public void i_enter_LastName(String lastName) throws Throwable {
        registerPage.enterLastName(lastName);
    }

    @Given("^I Enter Email \"([^\"]*)\"$")
    public void i_Enter_Email(String email) throws Throwable {
        registerPage.enterEmail(email);

    }

    @Given("^I Enter Company Name \"([^\"]*)\"$")
    public void i_Enter_Company_Name(String companyName1) throws Throwable {
        registerPage.enterCompanyName(companyName1);

    }

    @Given("^I Select newsletter$")
    public void i_Select_newsletter() throws Throwable {
        registerPage.unCheckNewsLetter();
    }

    @Given("^I Enter Password \"([^\"]*)\"$")
    public void i_Enter_Password(String password) throws Throwable {
        registerPage.enterPassword(password);
    }

    @Given("^I Enter Confirm Password \"([^\"]*)\"$")
    public void i_Enter_Confirm_Password(String confirmPassword) throws Throwable {
        registerPage.enterConfirmPassword(confirmPassword);
    }

    @When("^I click on Register Button$")
    public void i_click_on_Register_Button() throws Throwable {
        registerPage.submitRegister();
    }

    @Given("^I enter following details to register$")
    public void i_enter_following_details_to_register(DataTable registrationDetails) throws Throwable {
        List<Map<String, String>> data = registrationDetails.asMaps(String.class, String.class);
        registerPage.enterFirstName(data.get(0).get("firstName"));
        registerPage.enterLastName(data.get(0).get("lastName"));
        registerPage.enterEmail(data.get(0).get("email"));
        registerPage.enterPassword(data.get(0).get("password"));
        registerPage.enterConfirmPassword(data.get(0).get("confirmPassword"));

    }

}
