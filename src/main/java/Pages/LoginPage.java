package Pages;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.pagefactory.AjaxElementLocatorFactory;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;


public class LoginPage {
    WebDriver driver;

    @FindBy(linkText = "Login")
    private WebElement login;

    @FindBy(id = "spree_user_email")
    private WebElement emailTextBox;

    @FindBy(name = "spree_user[password]")
    private WebElement passwordTextBox;

    @FindBy(name = "commit")
    private WebElement submit;

    WebDriverWait wait;
    public LoginPage(WebDriver driver) {
        PageFactory.initElements(driver, this);
        wait = new WebDriverWait(driver,50);
    }

    public void login(String userEmail, String password)
    {
        login.click();
        emailTextBox.sendKeys(userEmail);
        passwordTextBox.sendKeys(password);
        submit.click();
    }

}
