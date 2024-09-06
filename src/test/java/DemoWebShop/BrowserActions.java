package DemoWebShop;

import org.openqa.selenium.*;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.Reporter;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

public class BrowserActions {
    private WebDriver driver;

    public BrowserActions(WebDriver driver) {
        this.driver = driver;
    }

    // Open a URL
    public BrowserActions openUrl(String url) {
        driver.get(url);
        Reporter.log("Browser initialized and site opened", true);
        String ActualTitle = driver.getTitle();
        Assert.assertEquals(ActualTitle,"Demo Web Shop");
        return this;
    }

    // Close the browser
    public BrowserActions closeBrowser() {
        driver.quit();
        Reporter.log("Browser Closed Successfully", true);
        return this;
    }

    // Maximize the browser window
    public BrowserActions maximizeWindow() {
        driver.manage().window().maximize();
        return this;
    }

    public BrowserActions implicitwait() {
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
        return this;
    }

    public BrowserActions ScreenShot() throws IOException {
        TakesScreenshot takescreenShot = (TakesScreenshot) driver;
        File temp = takescreenShot.getScreenshotAs(OutputType.FILE);//
        File src = new File("./ErrorShot/image.png");
        FileHandler.copy(temp, src);
        Reporter.log("Screenshot Captured", true);
        return this;
    }

    public BrowserActions navigateBack() {
        driver.navigate().back();
        return this;
    }

    public String Title() {
        return driver.getTitle();
    }

    public BrowserActions ExplicitWait(WebElement Element,Duration Timeout){
        WebDriverWait wait=new WebDriverWait(driver,Timeout);
        wait.until(ExpectedConditions.elementToBeClickable(Element));
        return this;
    }
}



