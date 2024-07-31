package DemoWebShop;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class EarRing {
    private WebDriver driver;
    private ActionClass action;

    public EarRing(WebDriver driver){
        this.driver=driver;
        this.action=new ActionClass(driver);
        PageFactory.initElements(driver,this);
    }

    @FindBy(css = "input[value='Add to compare list']")
    private WebElement AddToCompareBtn;
    public void ClickOnAddToCompareBtn(){
        action.click(AddToCompareBtn);
    }


}
