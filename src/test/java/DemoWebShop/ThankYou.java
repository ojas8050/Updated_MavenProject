package DemoWebShop;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ThankYou {
    private WebDriver driver;

    public ThankYou(WebDriver driver){
        this.driver=driver;
        PageFactory.initElements(driver,this);
    }

    @FindBy(css = "//input[@onclick=\"setLocation('/')\"]")
    private WebElement Continue;
    public ThankYou ClickOnContinue(){
        Continue.click();
        return this;
    }
}
