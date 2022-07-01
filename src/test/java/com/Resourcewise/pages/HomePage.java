package com.Resourcewise.pages;

import com.Resourcewise.driver.DriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;


public class HomePage extends DriverManager {

//@FindBy(className = ".ico-login")
WebElement loginButton= driver.findElement(By.className("ico-login"));

//@FindBy(css=".ico-register")
WebElement registerButton =driver.findElement(By.className("ico-register"));


    public void clickOnLoginButton(){
     loginButton.click();
    }

    public void clickOnRegisterButton () {
        registerButton.click();
    }

}
