package TestCases;

import DemoWebShop.BrowserActions;
import DemoWebShop.DigitalDownload;
import DemoWebShop.HomePage;
import DemoWebShop.LoginPage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class addMultipleProductsToCart {

    @Test
    public void AddMultipleproducts() throws InterruptedException {
        WebDriver driver=new ChromeDriver();
        BrowserActions ba=new BrowserActions(driver);
        ba.implicitwait();
        ba.maximizeWindow();
        ba.openUrl("https://demowebshop.tricentis.com/");

        HomePage hp=new HomePage(driver);
        hp.ClickOnLoginButton();
        LoginPage lp=new LoginPage(driver);
        lp.enterUsername("ojas1@gmail.com");
        lp.enterPassword("Ojas@123");
        lp.clickOnLogin();
        Reporter.log("Logged In",true);

        hp.ClickOnDigitalDowloads();
        Reporter.log("Clicked On Digital-Downloads",true);

        DigitalDownload dd=new DigitalDownload(driver);
        dd.MusicTwoAddToCartButton();
        Thread.sleep(500);
        dd.Music2AddtoCartButton();
        Thread.sleep(500);
        dd.thirdAlbumAddToCartButton();
        Reporter.log("3 Items are added to cart",true);
        dd.ClickOnShoppingCart();
        Reporter.log("Navigated To Shopping Cart With 3 items",true);
        ba.closeBrowser();
    }
}
