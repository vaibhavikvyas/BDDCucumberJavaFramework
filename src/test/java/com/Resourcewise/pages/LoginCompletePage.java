package com.Resourcewise.pages;

import com.Resourcewise.driver.DriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;


public class LoginCompletePage extends DriverManager {

    WebElement logoutButton = driver.findElement(By.className("ico-logout"));
    public Boolean checkLogoutButton(){
        //System.out.println(logoutButton.isDisplayed());
        return logoutButton.isDisplayed();    }
}
