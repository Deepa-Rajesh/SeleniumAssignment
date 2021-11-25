package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ShoppingCartPage {
    @FindBy(css = "td[class= 'lead']")
    private WebElement totalcartvalue;

    @FindBy(id = "checkout-link")
    private WebElement chekoutbtn;

    public void shoppingCart(WebDriver driver){
        PageFactory.initElements(driver, this);
        WebDriverWait wait = new WebDriverWait(driver,30);
    }
    public void cartDetail(){
       // String cartValue = totalcartvalue.getText();
        chekoutbtn.click();
       // return(cartValue);
    }
}
