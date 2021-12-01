package Vapasi_Selenium;



import Pages.*;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;


public class ProductCheckout extends BaseClass{

    WebDriver driver;

    @Test
    public void testItemAddedToCart() throws InterruptedException {
        LoginPage loginPage = new LoginPage(driver);
        HomePage homePage = new HomePage(driver);
        CategoryPage categoryPage = new CategoryPage(driver);
        ProductPage productPage = new ProductPage(driver);
        ShoppingCartPage shoppingCartPage = new ShoppingCartPage();
        CheckoutPage checkoutPage = new CheckoutPage(driver);
        PaymentPage paymentPage = new PaymentPage(driver);
        CompleteOrderPage completeOrderPage = new CompleteOrderPage(driver);


        loginPage.login("test123@test.com", "123456");
        homePage.verifyLandingPage();
        categoryPage.selectCategory(driver);
        categoryPage.selectProduct(driver);
        productPage.addProductToCart("2");
        shoppingCartPage.cartDetail();
        checkoutPage.addressSelection("Deepa", "Rajesh", "Door no 501",
                "Linking Road","Atlanta", "Georgia","60003","\"United States of America\"","9444043586");
        checkoutPage.shippingSameAsBilling();
        paymentPage.clickCheck();
        paymentPage.clickSaveAndContinue();
        String orderMessage = CompleteOrderPage.verifyOrderSuccessMessage();
        try {
            Assert.assertEquals(orderMessage, "Your order has been processed successfully");
        } catch (AssertionError e) {
            System.out.println(e.getMessage());

        }


    }

}