package com.Resourcewise.pages;

import com.Resourcewise.driver.DriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.Random;

public class RegisterPage extends DriverManager {

    DriverManager driverManager=new DriverManager();
    WebElement genderFemale = driver.findElement(By.className("female"));
    WebElement inputFirstName = driver.findElement(By.id("FirstName"));
    WebElement inputLastName = driver.findElement(By.id("LastName"));
    WebElement inputEnterEmail = driver.findElement(By.id("Email"));
    WebElement inputCompanyName = driver.findElement(By.id("Company"));
    WebElement newsLetter = driver.findElement(By.id("Newsletter"));
    WebElement inputPassword = driver.findElement(By.id("Password"));
    WebElement inputConfirmPassword = driver.findElement(By.id("ConfirmPassword"));
    WebElement registerButton = driver.findElement(By.id("register-button"));

    public void clickOnGenderFemale() {
        genderFemale.click();
    }

    public void enterFirstName(String firstName) {
        inputFirstName.sendKeys(firstName);
    }

    public void enterLastName(String lastName) {
        inputLastName.sendKeys(lastName);
    }

    public void enterEmail(String email) {
//        Random rnd = new Random();
//        email=rnd.nextInt(100)+email;
        inputEnterEmail.sendKeys(email);
    }

    public void enterCompanyName(String companyName) {
        inputCompanyName.sendKeys(companyName);
    }

    public void unCheckNewsLetter() {
        newsLetter.click();
    }

    public void enterPassword(String password) {
        inputPassword.sendKeys(password);
    }

    public void enterConfirmPassword(String password) {
        inputConfirmPassword.sendKeys(password);
    }

    public void submitRegister()  {
        registerButton.click();

    }
}