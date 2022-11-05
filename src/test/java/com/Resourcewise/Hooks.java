package com.Resourcewise;


import com.Resourcewise.driver.DriverManager;
import cucumber.api.java.After;
import cucumber.api.java.Before;

public class Hooks {

    DriverManager driverManager = new DriverManager();
    @Before
    public void setup() throws IllegalAccessException {

        //driverManager.runOnLocalBrowser();
        driverManager.runInHeadlessBrowser();
        driverManager.openWebPage();
        driverManager.maximiseBrowser();
        driverManager.applyImplicitWait(500);

    }

    @After
    public void tearDown() throws InterruptedException {
        //driverManager.sleepBrowser(3000);
        driverManager.quitBrowser();
    }

}
