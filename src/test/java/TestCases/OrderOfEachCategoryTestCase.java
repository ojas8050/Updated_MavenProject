package TestCases;

import DemoWebShop.*;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

import java.time.Duration;

public class OrderOfEachCategoryTestCase {
    @Test
    public void OrderEachCatProduct() throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        BrowserActions ba = new BrowserActions(driver);
        ba.implicitwait();
        ba.maximizeWindow();
        ba.openUrl("https://demowebshop.tricentis.com/");
        String ActualTitle = ba.Title();
        Assert.assertEquals(ActualTitle,"Demo Web Shop");

        HomePage hp = new HomePage(driver);
        hp.ClickOnLoginButton();
        LoginPage lp = new LoginPage(driver);
        lp.enterUsername("ojas1@gmail.com");
        lp.enterPassword("Ojas@123");
        lp.clickOnLogin();
        Reporter.log("Logged In", true);

        hp.ClickOnBooks();
        Books b=new Books(driver);
        b.FictionBookAddToCart();
        Reporter.log("Fiction book added to cart", true);

        hp.ClickOnComputers();
        Computers comp=new Computers(driver);
        comp.ClickOnDesktops();
        Desktops desk=new Desktops(driver);
        desk.ClickOnBuildOwnLaptopExpensive();

        BuilDExpensiveLaptop bel=new BuilDExpensiveLaptop(driver);
        bel.Select8GBRAM();
        bel.Select400GbHDD();
        bel.SelectFastProcesser();
        bel.SelectImageViewer();
        bel.SelectOfficeSuit();
        bel.SelectOtherOfficeSuite();
        bel.ClickOnAddToCart();
        Reporter.log("Expensive laptop added to cart", true);

        hp.ClickonElectronics();

        hp.ClickOnApparelNShoes();
        ApperalNShoes ans=new ApperalNShoes(driver);
        Shoes s=new Shoes(driver);
        s.ClickOnNext();
        ans.ClickOnShirtAddToCartButton();
        ans.ClickOnAddTocart();
        Reporter.log("Shirt added to cart", true);

        hp.ClickOnDigitalDowloads();
        DigitalDownload dd=new DigitalDownload(driver);
        dd.thirdAlbumAddToCartButton();
        Reporter.log("Digital album added to cart", true);

        hp.CLickonJewelry();
        Jwelry j=new Jwelry(driver);
        j.ClickOnDaimondHeartAddToCartButton();
        Reporter.log("Jewelry added to cart", true);

        hp.ClickOnGiftCards();
        GiftCards fc=new GiftCards(driver);
        fc.clickOn100DGiftCardAddToCard();
        fc.EnterReciptentName("Chandini");
        fc.ClickOnAddToCartBtn();
        Reporter.log("Gift card added to cart", true);
        hp.ClickOnShoppingCartBtn();


        Cart cart=new Cart(driver);
//        Assert.assertTrue(cart.isItemInCart("Fiction"), "Fiction book is not in the cart");
//        Assert.assertTrue(cart.isItemInCart("Build your own expensive computer"), "Expensive laptop is not in the cart");
        Assert.assertTrue(cart.isItemInCart("Men's Wrinkle Free Long Sleeve"), "Shirt is not in the cart");
        Assert.assertTrue(cart.isItemInCart("3rd Album"), "Digital album is not in the cart");
        Assert.assertTrue(cart.isItemInCart("Black & White Diamond Heart"), "Jewelry is not in the cart");
        Assert.assertTrue(cart.isItemInCart("$100 Physical Gift Card"), "Gift card is not in the cart");

        Reporter.log("All items verified in the cart", true);
        cart.ClickOnTNCCheckBox();

        cart.ClickOnCheckOutButton();

        Checkout co=new Checkout(driver);
        co.ClickOnBillingAddressContinue();
        co.ClickOnShippingContinue();
        co.ClickOnNextDayAir();
        co.ClickOnShippingMethod();
        co.ClickOnPaymentMethod();
        co.ClickOnPaymentInfo();
        co.ClickOnConfirmOrder();
        Reporter.log("Order confirmed", true);
        String OrderConfirmationMessage=co.getThankyouMessage().getText();
        Assert.assertTrue(OrderConfirmationMessage.contains("Thank you"),"Order confirmation failed");

        hp.getLogoutBtn();
        ba.closeBrowser();
        Reporter.log("Logged out successfully", true);


    }
}
