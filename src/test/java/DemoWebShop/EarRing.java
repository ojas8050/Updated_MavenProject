package DemoWebShop;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Reporter;

public class EarRing {
    private WebDriver driver;

    public EarRing(WebDriver driver){
        this.driver=driver;
        PageFactory.initElements(driver,this);
    }

    @FindBy(css = "input[value='Add to compare list']")
    private WebElement AddToCompareBtn;
    public EarRing ClickOnAddToCompareBtn(){
        AddToCompareBtn.click();
        Reporter.log("Ear Rings added to compare list", true);
        return this;
    }


}
