package TestCases;

import DemoWebShop.*;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class OrderOfEachCategoryTestCase {
    @Test
    public void OrderEachCatProduct() throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        BrowserActions ba = new BrowserActions(driver);
        ba.implicitwait();
        ba.maximizeWindow();
        ba.openUrl("https://demowebshop.tricentis.com/");

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

        hp.ClickonElectronics();

        hp.ClickOnApparelNShoes();
        ApperalNShoes ans=new ApperalNShoes(driver);
        Shoes s=new Shoes(driver);
        s.ClickOnNext();
        ans.ClickOnShirtAddToCartButton();
        ans.ClickOnAddTocart();

        hp.ClickOnDigitalDowloads();
        DigitalDownload dd=new DigitalDownload(driver);
        dd.thirdAlbumAddToCartButton();

        hp.CLickonJewelry();
        Jwelry j=new Jwelry(driver);
        j.ClickOnDaimondHeartAddToCartButton();

        hp.ClickOnGiftCards();
        GiftCards fc=new GiftCards(driver);
        fc.clickOn100DGiftCardAddToCard();
        fc.ClickOnAddToCartBtn();
        hp.ClickOnShoppingCartBtn();

        Cart cart=new Cart(driver);
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

        hp.getLogoutBtn();
        ba.closeBrowser();



    }
}
