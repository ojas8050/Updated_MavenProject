package LUMA;

import DemoWebShop.ActionClass;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class apparel {
    private WebDriver driver;
    private ActionClass action;

    public apparel(WebDriver driver){
        this.driver=driver;
        this.action=new ActionClass(driver);
        PageFactory.initElements(driver,this);
    }

    @FindBy(partialLinkText = "Shoes")
    private WebElement Shoes;
    public void ClickOnShoes(){
        action.click(Shoes);
    }


}
