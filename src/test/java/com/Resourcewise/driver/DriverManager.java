package com.Resourcewise.driver;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.concurrent.TimeUnit;

public class DriverManager {
    public static WebDriver driver;
    String browser = "chrome";
    String url= "https://demo.nopcommerce.com/";


    public void runOnLocalBrowser() throws IllegalAccessException {
        switch (browser){
            case "chrome":
                WebDriverManager.chromedriver().setup();
                driver=new ChromeDriver();
                break;
            case "edge":
                WebDriverManager.edgedriver().setup();
                driver= new EdgeDriver();
                break;
//            case "safari":
//                WebDriverManager.safaridriver().setup();
//                driver= new SafariDriver();
//                break;
                case "firefox":
                WebDriverManager.firefoxdriver().setup();
                driver=new FirefoxDriver();
                break;
            default:
                throw new IllegalAccessException("Unexpected browser");
        }
    }

    public void DriverManager(){
        PageFactory.initElements(driver,this);
    }
    public void maximiseBrowser(){
        driver.manage().window().maximize();
    }
    public void openWebPage(){
        driver.get(url);
    }
    public void applyImplicitWait(int sec){
       driver.manage().timeouts().implicitlyWait(sec,TimeUnit.SECONDS);
       //implemented implicit wait  with parameter second so that we can call  this method with different delays
    }

    public void waitUntilElementIsVisible(WebElement element,int timeOut,String failureMessage){
        WebDriverWait wait= new WebDriverWait(driver,timeOut);
        wait.until(ExpectedConditions.visibilityOf(element));
        wait.withMessage(failureMessage);
    }
    public void sleepBrowser(int ms) throws InterruptedException {
        Thread.sleep(ms);
    }

    public String copyUrl(){
        return driver.getCurrentUrl();
    }

    public void quitBrowser(){
        driver.quit();
    }

}
