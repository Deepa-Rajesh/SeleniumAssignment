package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

public class HomePage {
    @FindBy(css = "div.alert.alert-success")
    private WebElement welcomeMessage;
    WebDriverWait wait;
    public HomePage(WebDriver driver) {
        PageFactory.initElements(driver, this);
        wait = new WebDriverWait(driver,50);
    }

    public void verifyLandingPage(){

        Assert.assertEquals(welcomeMessage.getText(), "Logged in successfully");
    }
}
