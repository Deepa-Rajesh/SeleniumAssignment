package Vapasi_Selenium;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import java.io.File;
import java.util.concurrent.TimeUnit;

public class BaseClass {
    public static WebDriver driver;
    static String webPage = "https://spree-vapasi-prod.herokuapp.com";

    @BeforeMethod
    public static void initialize()
    {
        System.setProperty("webdriver.chrome.driver", "./driver/chromedriver");
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
        driver.get(webPage);
        driver.manage().window().maximize();
    }

    @AfterMethod
   public void screenShot(ITestResult result)  {
        if(ITestResult.FAILURE==result.getStatus()) {
            try {
                TakesScreenshot screenshot = (TakesScreenshot)driver;
                File srcshot = screenshot.getScreenshotAs(OutputType.FILE);
                FileUtils.copyFile(srcshot, new File("D:\\"+result.getName()+".png"));
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        }
        driver.quit();
    }
}