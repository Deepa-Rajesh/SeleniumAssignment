package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;


public class CheckoutPage {
    @FindBy(id = "order_bill_address_attributes_firstname")
    private WebElement firstName;
    @FindBy(id = "order_bill_address_attributes_lastname")
    private WebElement lastName;
    @FindBy(id = "order_bill_address_attributes_address1")
    private WebElement address;
    @FindBy(id = "order_bill_address_attributes_address2")
    private WebElement address2;
    @FindBy(id = "order_bill_address_attributes_city")
    private WebElement city;
    @FindBy(id = "order_bill_address_attributes_state_id")
    private WebElement state;
    @FindBy(id = "order_bill_address_attributes_zipcode")
    private WebElement zipcode;
    @FindBy(id = "order_bill_address_attributes_country_id")
    private WebElement country;
    @FindBy(id = "order_bill_address_attributes_phone")
    private WebElement phone;
    @FindBy(name = "save_user_address")
    private WebElement saveAddressChkBox;
    @FindBy(name= "order[use_billing]")
    private WebElement SameBillingChkBox;
    @FindBy(css = "input[value='Save and Continue']")
    private  WebElement saveAndContinueButton;

    WebDriverWait wait;
    public void CheckoutPage(WebDriver driver) {
        PageFactory.initElements(driver, this);
        wait = new WebDriverWait(driver, 50);
    }
    public CheckoutPage(WebDriver driver) {
        PageFactory.initElements(driver, this);
        wait = new WebDriverWait(driver, 50);
    }

    public void addressSelection(String firstname, String lastname , String Address, String Address2, String State,
                                  String phonenum, String Zipcode) {

        firstName.sendKeys(firstname);
        lastName.sendKeys(lastname);
        address.sendKeys(Address);
        address2.sendKeys(Address2);
        Select chooseState= new Select(state);
        chooseState.selectByVisibleText(State);
        zipcode.sendKeys(Zipcode);
        phone.sendKeys(phonenum);

    }

    public void shippingSameAsBilling(){
        Assert.assertTrue(SameBillingChkBox.isSelected());
        saveAddressChkBox.click();
        Assert.assertFalse(saveAddressChkBox.isSelected());
        saveAndContinueButton.click();

    }

}
