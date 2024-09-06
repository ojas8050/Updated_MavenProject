package TestCases;

import DemoWebShop.*;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class addMultipleProductsToCart {

    WebDriver driver=new ChromeDriver();
    BrowserActions ba =new BrowserActions(driver);
    HomePage hp=new HomePage(driver);
    LoginPage lp =new LoginPage(driver);
    DigitalDownload dd=new DigitalDownload(driver);
    Cart cart=new Cart(driver);

    @Test
    public void AddMultipleproducts() throws InterruptedException {
        ba.maximizeWindow()
                .implicitwait()
                .openUrl("https://demowebshop.tricentis.com/");
        hp.ClickOnLoginButton();
        lp.enterUsername("ojas1@gmail.com")
                .enterPassword("Ojas@123")
                .clickOnLogin();

        hp.ClickOnDigitalDowloads();

        dd.MusicTwoAddToCartButton()
                .Music2AddtoCartButton()
                .thirdAlbumAddToCartButton()
                .ClickOnShoppingCart();

        Assert.assertNotNull(cart.getCartItems(),"Shopping cart Shouldn't be Empty");
        hp.getLogoutBtn();
        ba.closeBrowser();
    }
}
