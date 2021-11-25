package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CompleteOrderPage {
    @FindBy(css = "div.alert.alert-notice")
    private  static WebElement orderSuccessMessage;

    public CompleteOrderPage(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }

    public static String verifyOrderSuccessMessage() {
        String orderMessage = orderSuccessMessage.getText();
        return orderMessage;
    }
}