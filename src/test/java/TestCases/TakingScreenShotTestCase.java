package TestCases;

import DemoWebShop.BrowserActions;
import DemoWebShop.HomePage;
import DemoWebShop.LoginPage;
import DemoWebShop.Shoes;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.io.IOException;

public class TakingScreenShotTestCase {
    WebDriver driver=new ChromeDriver();
    BrowserActions ba =new BrowserActions(driver);
    HomePage hp=new HomePage(driver);
    LoginPage lp =new LoginPage(driver);
    Shoes s = new Shoes(driver);

    @Test
    public void Screenshot() throws IOException {
        ba.maximizeWindow()
                .implicitwait()
                .openUrl("https://demowebshop.tricentis.com/");
        hp.ClickOnLoginButton();
        lp.enterUsername("ojas1@gmail.com")
                .enterPassword("Ojas@123")
                .clickOnLogin();
        hp.ClickOnApparelNShoes();
        s.ClickOnNext()
                .ClickOnShoes();
        ba.ScreenShot();
        hp.getLogoutBtn();
        ba.closeBrowser();
    }
}
