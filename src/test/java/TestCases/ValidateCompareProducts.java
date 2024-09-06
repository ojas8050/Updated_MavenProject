package TestCases;

import DemoWebShop.*;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class ValidateCompareProducts {
    WebDriver driver=new ChromeDriver();
    BrowserActions ba =new BrowserActions(driver);
    HomePage hp=new HomePage(driver);
    LoginPage lp =new LoginPage(driver);
    DigitalDownload dd=new DigitalDownload(driver);
    Jwelry j=new Jwelry(driver);
    EarRing er = new EarRing(driver);
    EngagementRing Ering = new EngagementRing(driver);
    CompareProducts cp = new CompareProducts(driver);

    @Test
    public void ValidateTestCase(){
        ba.maximizeWindow()
                .implicitwait()
                .openUrl("https://demowebshop.tricentis.com/");
        hp.ClickOnLoginButton();
        lp.enterUsername("ojas1@gmail.com")
                .enterPassword("Ojas@123")
                .clickOnLogin();

        hp.CLickonJewelry();
        // 1st Product added to compare List
        j.ClickOnEarRings();
        er.ClickOnAddToCompareBtn();

        // 2nd product added to compare List
        hp.CLickonJewelry();
        j.ClickOnEngagementRing();
        Ering.CLickOnAddToCompare();

        hp.ClickOnCompareList();
        // Validate the presence of the products
        Assert.assertTrue(cp.getEarRnings().isDisplayed(), "Ear Rings are not added to compare list");
        Assert.assertTrue(cp.getEngagementRing().isDisplayed(), "Engagement Ring is not added to compare list");

        // Validate the names of the products in the compare list
        String expectedEarRingName = "Diamond Pave Earrings";
        String expectedEngagementRingName = "Vintage Style Three Stone Diamond Engagement Ring";
        Assert.assertEquals(cp.getEarRnings().getText(), expectedEarRingName, "Ear Ring name is incorrect in compare list");
        Assert.assertEquals(cp.getEngagementRing().getText(), expectedEngagementRingName, "Engagement Ring name is incorrect in compare list");

        // Validate the prices or other details if needed
        String expectedEarRingPrice = "From 350.00";
        String expectedEngagementRingPrice = "2100.00";
        Assert.assertEquals(cp.getEarringPrice().getText(), expectedEarRingPrice, "Ear Ring price is incorrect in compare list");
        Assert.assertEquals(cp.getRingPrice().getText(), expectedEngagementRingPrice, "Engagement Ring price is incorrect in compare list");

        Reporter.log("Compare list validation completed successfully", true);
        hp.getLogoutBtn();
        ba.closeBrowser();
    }
}
