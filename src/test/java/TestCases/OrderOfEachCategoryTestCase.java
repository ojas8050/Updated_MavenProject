package TestCases;

import DemoWebShop.*;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.time.Duration;

public class OrderOfEachCategoryTestCase {
    WebDriver driver=new ChromeDriver();
    BrowserActions ba =new BrowserActions(driver);
    HomePage hp=new HomePage(driver);
    LoginPage lp =new LoginPage(driver);
    DigitalDownload dd=new DigitalDownload(driver);
    Cart cart=new Cart(driver);
    Books b=new Books(driver);
    Computers comp=new Computers(driver);
    Desktops desk=new Desktops(driver);
    BuilDExpensiveLaptop bel=new BuilDExpensiveLaptop(driver);
    ApperalNShoes ans=new ApperalNShoes(driver);
    Shoes s=new Shoes(driver);
    Jwelry j=new Jwelry(driver);
    GiftCards fc=new GiftCards(driver);
    Checkout co=new Checkout(driver);

    @Test
    public void OrderEachCatProduct() {

        ba.maximizeWindow()
                .implicitwait()
                .openUrl("https://demowebshop.tricentis.com/");
        hp.ClickOnLoginButton();
        lp.enterUsername("ojas1@gmail.com")
                .enterPassword("Ojas@123")
                .clickOnLogin();

        hp.ClickOnBooks();
        b.FictionBookAddToCart();

        hp.ClickOnComputers();
        comp.ClickOnDesktops();
        desk.ClickOnBuildOwnLaptopExpensive();
        bel.Select8GBRAM()
                .Select400GbHDD()
                .SelectFastProcesser()
                .SelectImageViewer()
                .SelectOfficeSuit()
                .SelectOtherOfficeSuite()
                .ClickOnAddToCart();

        hp.ClickonElectronics()
            .ClickOnApparelNShoes();

        s.ClickOnNext();
        ans.ClickOnShirtAddToCartButton()
            .ClickOnAddTocart();

        hp.ClickOnDigitalDowloads();
        dd.thirdAlbumAddToCartButton();

        hp.CLickonJewelry();
        j.ClickOnDaimondHeartAddToCartButton();


        hp.ClickOnGiftCards();
        fc.clickOn100DGiftCardAddToCard()
                .EnterReciptentName("Chandini")
                .ClickOnAddToCartBtn();

        hp.ClickOnShoppingCartBtn();
        Assert.assertTrue(cart.isItemInCart("Fiction"), "Fiction book is not in the cart");
        Assert.assertTrue(cart.isItemInCart("Build your own expensive computer"), "Expensive laptop is not in the cart");
        Assert.assertTrue(cart.isItemInCart("Men's Wrinkle Free Long Sleeve"), "Shirt is not in the cart");
        Assert.assertTrue(cart.isItemInCart("3rd Album"), "Digital album is not in the cart");
        Assert.assertTrue(cart.isItemInCart("Black & White Diamond Heart"), "Jewelry is not in the cart");
        Assert.assertTrue(cart.isItemInCart("$100 Physical Gift Card"), "Gift card is not in the cart");
        Reporter.log("All items verified in the cart", true);

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
