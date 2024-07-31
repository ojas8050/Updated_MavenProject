package DemoWebShop;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CompareProducts {
    private WebDriver driver;
    private ActionClass action;

    public CompareProducts(WebDriver driver){
        this.driver=driver;
        this.action=new ActionClass(driver);
        PageFactory.initElements(driver,this);
    }

    @FindBy(linkText = "Diamond Pave Earrings")
    private WebElement EarRnings;

    @FindBy(linkText = "Vintage Style Three Stone Diamond Engagement Ring")
    private WebElement EngagementRing;

    public WebElement getEarRnings() {
        return EarRnings;
    }

    public WebElement getEngagementRing() {
        return EngagementRing;
    }

    @FindBy(xpath = "//td[normalize-space()='From 350.00']")
    private WebElement EarringPrice;

    public WebElement getEarringPrice() {
        return EarringPrice;
    }

    @FindBy(xpath = "//td[normalize-space()='2100.00']")
    private WebElement RingPrice;

    public WebElement getRingPrice() {
        return RingPrice;
    }




}
