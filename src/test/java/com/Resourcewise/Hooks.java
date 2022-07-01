package com.Resourcewise;


import com.Resourcewise.driver.DriverManager;
import cucumber.api.java.After;
import cucumber.api.java.Before;

public class Hooks {

    DriverManager driverManager = new DriverManager();
    @Before
    public void setup() throws IllegalAccessException {

        driverManager.runOnLocalBrowser();
        driverManager.openWebPage();
        driverManager.maximiseBrowser();
        driverManager.applyImplicitWait();

    }

    @After
    public void tearDown() throws InterruptedException {
        driverManager.sleepBrowser(2000);
        driverManager.quitBrowser();
    }

}
