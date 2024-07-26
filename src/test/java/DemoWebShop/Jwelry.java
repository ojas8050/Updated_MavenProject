package DemoWebShop;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Jwelry {
    private WebDriver driver;
    private ActionClass action;

    public Jwelry(WebDriver driver){
        this.driver=driver;
        this.action=new ActionClass(driver);
        PageFactory.initElements(driver,this);
    }

    @FindBy(xpath = "//span[text()='130.00']/../..//input")
    private WebElement AddtocartButton;
    public void ClickOnDaimondHeartAddToCartButton(){
        action.click(AddtocartButton);
    }

}
