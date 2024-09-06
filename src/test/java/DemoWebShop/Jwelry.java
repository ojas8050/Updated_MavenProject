package DemoWebShop;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Reporter;

public class Jwelry {
    private WebDriver driver;

    public Jwelry(WebDriver driver){
        this.driver=driver;
        PageFactory.initElements(driver,this);
    }

    @FindBy(xpath = "//span[text()='130.00']/../..//input")
    private WebElement AddtocartButton;
    public Jwelry ClickOnDaimondHeartAddToCartButton(){
        AddtocartButton.click();
        Reporter.log("Jewelry added to cart", true);
        return this;
    }

    @FindBy(linkText = "Vintage Style Three Stone Diamond Engagement Ring")
    private WebElement DaimondEngRing;
    public Jwelry ClickOnEngagementRing(){
        DaimondEngRing.click();
        return this;
    }

    @FindBy(linkText = "Diamond Pave Earrings")
    private WebElement EarRings;
    public Jwelry ClickOnEarRings(){
        EarRings.click();
        return this;
    }





}
