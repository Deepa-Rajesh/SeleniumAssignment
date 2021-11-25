package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PaymentPage {
    @FindBy(id = "order_payments_attributes__payment_method_id_3")
    private WebElement radioButtonCheck;

    @FindBy(name = "commit")
    private WebElement buttonSaveAndContinue;

    public PaymentPage(WebDriver driver){
        PageFactory.initElements(driver,this);
    }
    public void clickCheck(){
        radioButtonCheck.click();
    }
    public void clickSaveAndContinue(){
        buttonSaveAndContinue.click();
    }
}
