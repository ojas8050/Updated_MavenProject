package nopCommerce;

import DemoWebShop.ActionClass;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.net.IDN;

public class RegisterNewuser {
    private WebDriver driver;
    private ActionClass action;

    public RegisterNewuser(WebDriver driver){
        this.driver=driver;
        this.action=new ActionClass(driver);
        PageFactory.initElements(driver,this);
    }

    @FindBy(id = "gender-male")
    private WebElement Male;
    public void ClickOnMaleoption(){
        action.click(Male);
    }

    @FindBy(id = "FirstName")
    private WebElement FirstName;
    public void EnterUserName(String username){
        action.sendKeys(FirstName,username);
    }


}
