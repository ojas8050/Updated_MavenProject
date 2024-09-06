package TestCases;

import DemoWebShop.*;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class PlaceOrderTestCase {
    WebDriver driver=new ChromeDriver();
    BrowserActions ba =new BrowserActions(driver);
    HomePage hp=new HomePage(driver);
    LoginPage lp =new LoginPage(driver);
    Cart cart=new Cart(driver);
    Checkout co=new Checkout(driver);
    Electronics e=new Electronics(driver);
    CellPhone c=new CellPhone(driver);
    SmartPhone sp=new SmartPhone(driver);

    @Test
    public void PlaceOrder(){
        driver =new ChromeDriver();
        ba.maximizeWindow()
                .implicitwait()
                .openUrl("https://demowebshop.tricentis.com/");
        hp.ClickOnLoginButton();
        lp.enterUsername("ojas1@gmail.com")
                .enterPassword("Ojas@123")
                .clickOnLogin();

        hp.ClickonElectronics();
        e.ClickOnCellPhoneLink();
        c.ClickonSmartPhonelink();
        sp.ClickonAddToCartButton()
                .ClickOnShoppingCart();
        cart.ClickOnTNCCheckBox()
                .ClickOnCheckOutButton();

        co.ClickOnBillingAddressContinue()
                .ClickOnShippingContinue()
                .ClickOnNextDayAir()
                .ClickOnShippingMethod()
                .ClickOnPaymentMethod()
                .ClickOnPaymentInfo()
                .ClickOnConfirmOrder();
        String OrderConfirmationMessage=co.getThankyouMessage().getText();
        Assert.assertTrue(OrderConfirmationMessage.contains("Thank you"),"Order confirmation failed");
        hp.getLogoutBtn();
        ba.closeBrowser();
    }
}
