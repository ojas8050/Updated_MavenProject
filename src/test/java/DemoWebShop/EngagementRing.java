package DemoWebShop;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Reporter;

public class EngagementRing {
    private WebDriver driver;

    public EngagementRing(WebDriver driver){
        this.driver=driver;
        PageFactory.initElements(driver,this);
    }

    @FindBy(css = "input[value='Add to compare list']")
    private WebElement AddtoCompareListButton;
    public EngagementRing CLickOnAddToCompare(){
        AddtoCompareListButton.click();
        Reporter.log("Engagement Ring added to compare list", true);
        return this;
    }



}
