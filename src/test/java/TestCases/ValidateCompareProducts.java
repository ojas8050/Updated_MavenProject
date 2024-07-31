package TestCases;

import DemoWebShop.*;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class ValidateCompareProducts {
    @Test
    public void ValidateTestCase(){
        WebDriver driver = new ChromeDriver();
        BrowserActions ba = new BrowserActions(driver);
        ba.maximizeWindow();
        ba.implicitwait();
        ba.openUrl("https://demowebshop.tricentis.com/");
        Reporter.log("Browser initialized and site opened", true);

        // Login
        HomePage hp = new HomePage(driver);
        hp.ClickOnLoginButton();
        LoginPage lp = new LoginPage(driver);
        lp.enterUsername("Ojas1@gmail.com");
        lp.enterPassword("Ojas@123");
        lp.clickOnLogin();
        Reporter.log("Logged in successfully", true);

        hp.CLickonJewelry();
        Jwelry j = new Jwelry(driver);

        // 1st Product added to compare List
        j.ClickOnEarRings();
        EarRing er = new EarRing(driver);
        er.ClickOnAddToCompareBtn();
        Reporter.log("Ear Rings added to compare list", true);

        // 2nd product added to compare List
        hp.CLickonJewelry();
        j.ClickOnEngagementRing();
        EngagementRing Ering = new EngagementRing(driver);
        Ering.CLickOnAddToCompare();
        Reporter.log("Engagement Ring added to compare list", true);

        hp.ClickOnCompareList();
        Reporter.log("Navigated to compare list", true);

        CompareProducts cp = new CompareProducts(driver);

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

        driver.quit();
    }
}
