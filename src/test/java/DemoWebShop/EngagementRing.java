package DemoWebShop;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class EngagementRing {
    private WebDriver driver;
    private ActionClass action;

    public EngagementRing(WebDriver driver){
        this.driver=driver;
        this.action=new ActionClass(driver);
        PageFactory.initElements(driver,this);
    }

    @FindBy(css = "input[value='Add to compare list']")
    private WebElement AddtoCompareListButton;
    public void CLickOnAddToCompare(){
        action.click(AddtoCompareListButton);
    }



}
