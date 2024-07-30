package nopCommerce;

import DemoWebShop.ActionClass;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {
    private WebDriver driver;
    private ActionClass action;

    public HomePage(WebDriver driver){
        this.driver=driver;
        this.action=new ActionClass(driver);
        PageFactory.initElements(driver,this);
    }

    @FindBy(linkText = "Register")
    private WebElement RegisterLink;
    public void ClickOnRegisterLink(){
        action.click(RegisterLink);
    }

    @FindBy(linkText = "Log in")
    private WebElement LogInLink;
    public void ClickOnLogInLink(){
        action.click(LogInLink);
    }

    @FindBy(linkText = "Shopping cart")
    private WebElement ShoppingcartLink;
    public void ClickOnShoppingcartLink(){
        action.click(ShoppingcartLink);
    }

    @FindBy(linkText = "Apparel ")
    private WebElement Apparel;
    public void ClickOnApparel(){
        action.click(Apparel);
    }


}
