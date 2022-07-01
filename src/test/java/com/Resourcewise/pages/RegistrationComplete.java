package com.Resourcewise.pages;

import com.Resourcewise.driver.DriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class RegistrationComplete extends DriverManager {

//    @FindBy(css = "div[class='result']")
//    private WebElement registrationCompletedMessage;
      WebElement registrationCompletedMessage=driver.findElement(By.className("result"));

    public String getRegistrationCompletedMessage() throws InterruptedException {
        return (registrationCompletedMessage.getText());

    }

}
