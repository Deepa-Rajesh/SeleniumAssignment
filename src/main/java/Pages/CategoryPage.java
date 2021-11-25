package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.internal.WebElementToJsonConverter;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

import javax.xml.xpath.XPath;

public class CategoryPage {
    WebDriver driver;

    @FindBy(linkText = "Bags")
    private WebElement category;

    @FindBy(xpath = "/span[@title='Spree Bag'")
    private WebElement product;

    WebDriverWait wait;

    public CategoryPage(WebDriver driver) {
        PageFactory.initElements(driver, this);
        wait = new WebDriverWait(driver, 50);
    }

    public void selectCategory(WebDriver driver) {
        category.click();

    }

    public void selectProduct(WebDriver driver) {
        product.click();
    }
}
