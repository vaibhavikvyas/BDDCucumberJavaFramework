package com.Resourcewise.driver;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.Random;
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

    public void runInHeadlessBrowser() throws IllegalAccessException {
        switch (browser){
            case "chrome":
                WebDriverManager.chromedriver().setup();
                ChromeOptions chromeOptions = new ChromeOptions();
                chromeOptions.setHeadless(true);
                chromeOptions.addArguments("--window-size=1920,1080");
                driver = new ChromeDriver(chromeOptions);

                break;
            case "firefox":
                WebDriverManager.firefoxdriver().setup();
                FirefoxOptions firefoxOptions=new FirefoxOptions();
                firefoxOptions.setHeadless(true);
                firefoxOptions.addArguments("--window-size=1920,1080");
                driver=new FirefoxDriver(firefoxOptions);
                break;
            case "edge":
                WebDriverManager.edgedriver().setup();
                EdgeOptions edgeOptions = new EdgeOptions();
                edgeOptions.setCapability("headless", true);
                driver= new EdgeDriver(edgeOptions);
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

//    public int randomNumber(){
//        Random rnd = new Random();
//        return rnd.nextInt();
//    }
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
