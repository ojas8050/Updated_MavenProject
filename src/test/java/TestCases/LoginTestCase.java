package TestCases;

import DemoWebShop.*;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

import java.io.IOException;

public class LoginTestCase {
    WebDriver driver=new ChromeDriver();
    HomePage hp=new HomePage(driver);
    BrowserActions ba=new BrowserActions(driver);
    LoginPage lp=new LoginPage(driver);


    @Test
    public void Login(){
        ba.maximizeWindow()
            .implicitwait()
            .openUrl("https://demowebshop.tricentis.com/");
        hp.ClickOnLoginButton();
        lp.enterUsername("ojas1@gmail.com")
            .enterPassword("Ojas@123")
            .clickOnLogin();
        hp.getLogoutBtn();
        ba.closeBrowser();
    }
}
