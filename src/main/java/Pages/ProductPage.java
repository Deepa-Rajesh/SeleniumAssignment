package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ProductPage {

    @FindBy(id = "add-to-cart-button")
    private WebElement addtocartbtn;

    @FindBy(id = "quantity")
    private WebElement quantitytxtbox;

    public ProductPage(WebDriver driver) {
        PageFactory.initElements(driver, this);
        WebDriverWait wait = new WebDriverWait(driver,50);
    }
    public void addProductToCart(String quantity){
        quantitytxtbox.clear();
        quantitytxtbox.sendKeys(quantity);
        addtocartbtn.click();

    }

}