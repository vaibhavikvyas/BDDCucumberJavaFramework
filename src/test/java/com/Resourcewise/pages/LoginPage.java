package com.Resourcewise.pages;

import com.Resourcewise.driver.DriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage extends DriverManager {

//    @FindBy(css = ".page-title")
      WebElement welcomeSignInText=driver.findElement(By.className("page-title"));
      WebElement inputEmail = driver.findElement(By.id("Email"));
      WebElement inputPassword =driver.findElement(By.id("Password"));
      WebElement loginButton=driver.findElement( By.className ("login-button"));

    public String getWelcomeMessageOnLoginPage(){
       return (welcomeSignInText.getText());
    }

    public void enterEmailAndPassword(String email,String password){

        inputEmail.clear();
        inputEmail.sendKeys(email);
        inputPassword.clear();
        inputPassword.sendKeys(password);
    }
    public void clickOnLoginButton(){
        loginButton.click();
    }

   // WebElement orderMessage=driver.findElement( By.className ("message"));
    //String errorMessage=" Element did not load";
    //waitUntilElementIsVisible(orderMessage,30,errorMessage);

   // WebElement logoutButton=driver.findElement(By.Name("logout"));

   // WebElement element=waitUntilElementIsClickable(logoutButton);
}
